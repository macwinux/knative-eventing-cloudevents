from parliament import Context, event
import input as i
import output as o
import json
#import ast
@event
def main(context: Context):
    """
    Function template
    The context parameter contains the Flask request object and any
    CloudEvent received with the request.
    """
    #data = json.dumps(ast.literal_eval(str(context.cloud_event.data)))
    #payload = json.loads(data)
    data = context.cloud_event.data
    if isinstance(data,str):
        data = json.loads(data)
    input = i.input_schema.load(data)
    output = o.Type3("type3",input.users[0])
    return o.output_schema.dump(output)


