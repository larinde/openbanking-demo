# Open Banking Demo


## Target Architecture

![Inflation Estimation Model](./doc/target_architecture.drawio.png)



## Build and deploy

```bash
 mvn clean package
 sam deploy -g --region eu-west-2  --stack-name openbanking-demo-app
```