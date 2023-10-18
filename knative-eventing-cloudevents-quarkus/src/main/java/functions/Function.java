package functions;

import io.quarkus.funqy.Funq;
import io.quarkus.funqy.knative.events.CloudEvent;
import io.quarkus.funqy.knative.events.CloudEventBuilder;
import io.quarkus.funqy.knative.events.CloudEventMapping;
import lombok.val;
import lombok.extern.jbosslog.JBossLog;

/**
 * Your Function class
 */
@JBossLog
public class Function {

    /**
     * Use the Quarkus Funq extension for the function. This example
     * function simply read the input event and return a output event.
     * 
     * @param input a CloudEvent
     * @return a CloudEvent
     */

    @Funq
    @CloudEventMapping(responseType = "event.type1", responseSource = "ce-quarkus")
    public CloudEvent<Output> function(CloudEvent<Input> input) {

        // Add your business logic here
        val data = input.data();
        log.info(data);
        Output output = new Output("Message received of type: " + data.type());

        return CloudEventBuilder.create().build(output);
    }

}
