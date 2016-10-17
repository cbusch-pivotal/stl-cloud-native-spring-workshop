# Pivotal Cloud Foundry Environments

## Environment information
Use the following to log into specific environments

## PCF Environment Information

### Pivotal Web Services (PWS)
- http://run.pivotal.io
- Login with personal information or create an account
- Use [PWS Marketplace services](#pivotal-web-server-marketplace-services-and-plans) below

### Partner First National Technology Solutions (FNTS)
- https://apps.system.pivotal.fnts.com
- Login with your assigned student --> `student1` through `student25`
- User [FNTS/PEZ Marketplace services](#fnts-or-pivotal-haas-environment) below

### Pivotal Elastic Zone (PEZ)
- https://apps.run.haas-64.pez.pivotal.io
- Login with your assigned student --> `student1` through `student25`
- User [FNTS/PEZ Marketplace services](#fnts-or-pivotal-haas-environment) below

## Markplace Information
Depending upon the PCF environment in which you are connected, the following Marketplace Services and Plans are available. For instance, if you are instructed to create a new 100mb MySQL service instance while using the PWS environment, then use the following:

```
$ cf create-service p-mysql 100mb mydb
```

Otherwise, for the FNTS or PEZ environments, use the following:

```
$ cf create-service p-mysql 100mb-dev mydb
```

### Pivotal Web Server MarketPlace services and plans
Service Name | Plans | Description
------------ | ----- | -----------
app-autoscaler | bronze, gold | Scales bound applications in response to load (beta)
cleardb | spark, boost*, amp*, shock* | Highly available MySQL for your Apps.
cloudamqp | lemur, tiger*, bunny*, rabbit*, panda* | Managed HA RabbitMQ servers in the cloud
p-circuit-breaker-dashboard | standard | Circuit Breaker Dashboard for Spring Cloud Applications
p-config-server | standard | Config Server for Spring Cloud Applications
p-mysql | 100mb, 1gb, 20gb | MySQL databases on demand
p-service-registry | standard | Service Registry for Spring Cloud Applications
rediscloud | 100mb*, 250mb*, 500mb*, 1gb*, 2-5gb*, 5gb*, 10gb*, 50gb*, 30mb | Enterprise-Class Redis for Developers

### FNTS or PEZ PCF Environments
Service Name | Plans | Description
------------ | ----- | -----------
apigee-edge | org | Apigee Edge API Platform
app-autoscaler | bronze, gold | Scales bound applications in response to load (beta)
p-circuit-breaker-dashboard | standard | Circuit Breaker Dashboard for Spring Cloud Applications
p-config-server | standard | Config Server for Spring Cloud Applications
p-mysql | 100mb-dev | MySQL service for application development and testing
p-rabbitmq | standard | RabbitMQ is a robust and scalable high-performance multi-protocol messaging broker.
p-redis | shared-vm, dedicated-vm | Redis service to provide a key-value store
p-service-registry | standard | Service Registry for Spring Cloud Applications

[Course Materials home](/README.md#course-materials)
