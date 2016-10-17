# Pivotal Cloud Foundry Environments

## PCF Environment Information
Use the following information to connect (login) to specific environments as directed by the instructor.

### Pivotal Web Services (PWS)
- Website: http://run.pivotal.io
- Endpoint: api.run.pivotal.io
- Login with personal information or create an account
- Use [PWS Marketplace services](#pws-marketplace-services-and-plans) below

### Partner First National Technology Solutions (FNTS)
- Website: https://apps.system.pivotal.fnts.com
- Endpoint: api.system.pivotal.fnts.com
- Login with your assigned student --> `student1` through `student25`
- User [FNTS/PEZ Marketplace services](#fnts-or-pez-marketplace-services-and-plans) below

### Pivotal Elastic Zone (PEZ)
- Website: https://apps.run.haas-64.pez.pivotal.io
- Endpoint: api.run.haas-64.pez.pivotal.io
- Login with your assigned student --> `student1` through `student25`
- User [FNTS/PEZ Marketplace services](#fnts-or-pez-marketplace-services-and-plans) below

## Logging into an Environment
Using the above information, your step to login are as follows below. When logging in, PCF will ask you for your password and which PCF Space, i.e. development, test, or production, in which you would like to work. Spaces can always be changed later using `cf target -s test`, for instance.

```
$ cf login -a <endpoint> -u <user> --skip-ssl-validation
```

So for PWS, use your email address from when you created your account.

```
$ cf login -a api.run.pivotal.io -u myname@email.com --skip-ssl-validation
```

Or for FNTS, use the student# you were assigned.

```
$ cf login -a api.system.pivotal.fnts.com -u student1 --skip-ssl-validation
```

## Markplace Information
Depending upon the PCF environment in which you are connected, the following Marketplace Services and Plans are available. For instance, if you are instructed to create a new 100mb MySQL service instance while using the PWS environment, then use the following:

```
$ cf create-service p-mysql 100mb mydb
```

Otherwise, for the FNTS or PEZ environments, use the following:

```
$ cf create-service p-mysql 100mb-dev mydb
```

### PWS MarketPlace Services and Plans
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

### FNTS or PEZ Marketplace Services and Plans
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
