from dataclasses import dataclass, field

import marshmallow_dataclass
import marshmallow.validate

@dataclass
class User:
    age: int = field(metadata={"validate": marshmallow.validate.Range(min=10, max=100)})
    name: str = field(default="")
    

@dataclass
class Type3:
    user: User  
    type: str = field(default="type3")

output_schema = marshmallow_dataclass.class_schema(Type3)()