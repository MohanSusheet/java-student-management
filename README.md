Our DTOs(CreateStudentRequest and UpdateStudentRequest) satisfy every property of a record.

They are:
✅ immutable
✅ data carriers
✅ value objects
✅ no inheritance
✅ no identity

They are literally the textbook use case.

| Type                 | Mutable      | Identity   | Record       |
|:---------------------|:-------------|:-----------|:-------------|
| Student              | ✅ | Student ID | ❌ |
| CreateStudentRequest | ❌ | No         | ✅ |
| UpdateStudentRequest | ❌ | No         | ✅ |
