# jackson-bug
A proof of concept for a bug in Jackson serializer

## The issue

There are fields in capital letters. These fields are annotated with @JsonProperty.
See (MyCollection.java)[src/main/java/me/tychsen/test/MyCollection.java]

The output that comes out is incorrect. See here:

```
value =
{
  "mat": {
    "name": "MAT object"
  },
  "dar": {
    "name": "DAR object"
  },
  "MAT": {
    "name": "MAT object"
  },
  "DAR": {
    "name": "DAR object"
  },
  "requestedBFE": "101262"
}
```

As you can see - the all-caps properties are output twice.