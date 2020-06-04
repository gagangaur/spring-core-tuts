# 	Spring Application 
#### >> Implementation of dependency injection using spring framework via XML configuration and achieving loose coupling via setter based injections.

#### 	Terminologies :

**>>	Bean : (In spring terminology, java object is called a bean. The java objects that are stored in container are called beans.)**

**>>	IOC(Inversion of Control) : IOC means Inversion of Control. It means, rather than we creating the java objects, spring will create the objects.**

####> Types of dependencies:
>> Literal dependencies **int i**

>> Object dependencies **Object obj**

### > Bean Creation
>> **<bean id="vehicle" class="com.transport.Bus" />** (using xml based configuration)

> ###Ways to inject dependencies:

>> 1. Setter Based Injections -
	> uses property inside the bean tag to inject dependencies via setter based injection.   
	**<bean id = "person" class = "com.example.Person">  <property name = "name" value = "Gagan Gaur"/>       <bean>**
	
>> 2. Constructor Based Injections -> **<constructor-arg value="10" type="int"> </constructor-arg>**
	