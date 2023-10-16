package functions;

import io.quarkus.funqy.Funq;
import io.quarkus.funqy.knative.events.CloudEvent;
import io.quarkus.funqy.knative.events.CloudEventBuilder;
import lombok.val;

/**
 * Your Function class
 */
public class Function {

    /**
     * Use the Quarkus Funq extension for the function. This example
     * function simply echoes its input data.
     * 
     * @param input a CloudEvent
     * @return a CloudEvent
     */
    @Funq
    public CloudEvent<Output> function(CloudEvent<Input> input) {

        // Add your business logic here
        val data = input.data();
        System.out.println(data);
        Output output = new Output("Message received of type: " + data.getType());
        return CloudEventBuilder.create().build(output);
    }

}
