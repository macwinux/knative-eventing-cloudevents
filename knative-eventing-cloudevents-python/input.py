from dataclasses import dataclass, field
from typing import List, Literal

import marshmallow_dataclass
import marshmallow.validate

@dataclass
class User:
    age: int = field(metadata={"validate": marshmallow.validate.Range(min=10, max=100)})
    name: str = field(default="")
    

@dataclass
class Type2:
    type: Literal['type2']
    users: List[User] = field(default_factory=list)  

input_schema = marshmallow_dataclass.class_schema(Type2)()