# API Readiness Review

1. Check that established RESTful conventions are being followed:
   - Leveraging HTTP protocols
   - Naming conventions based on nouns
2. User-friendly documentation of resources and their context
3. Standard error response message definitions are followed
   - error code for detailed lookup
   - Avoid exposing too much information in order to reduce attack surface
   - Providing teace id in error response for traceabilty
4. Schema definition with constraints for resources in API spec.
5. API security definition
6. Provision of a sandbox for sanity testing
   - Provide an executable test collection using a tool like Postman
   - Provide happy path and negative test case scenarios
7. Publishing of API spec for discovearability - ideally a Portal or repository.
