# MessageProcessingService
NOTE: not vibe coded.

## Goal
The application will simulate a simple message processing 
system similar to those used in financial environments.

### It will:
- Get msgs via REST API
- Validate them
- Transform and route
- Be able to process anynchronously
- Store results

## Flow

### 1. Send message

e.g. POST -> /api/messages
```
{ 
    "type": "PAYMENT", 
    "amount": 1234, 
    "currency": "PLN", 
    "userId": "123" 
}
```
with response:
```
{
    "messageId": 67,
    "status": "ACCEPTED"
}
```

### 2.Get all messages

e.g. GET -> /api/messages

returns all processed messages

### 3. Get msg by ID

e.g. GET -> /api/messages/{id}

returns specified message content

## Validation Rules
- `type` == PAYMENT or REFUND
- `amount` > 0
- `currency` valid 3 letter code
- `userId` not empty
- reject messages with invalid data

## Transformation
Enrich messages with:
- timestamp
- messageId

## Routing
Messages need to be routed based on type - mock

## Error handling
- invalid rqst -> 400
- (?)

## API docs
`http://localhost:2137/swagger-ui/index.html`