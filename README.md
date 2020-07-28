# `Spring-Core-Tuts`
#### >  **`Implementation of dependency injection using spring framework via both xml based configuration and annotation based configuraion.`**


# 	Spring Application 
#### >> Implementation of dependency injection using spring framework via XML configuration and achieving loose coupling via setter based injections.

#### 	Terminologies :

**>>	Bean : (In spring terminology, java object is called a bean. The java objects that are stored in container are called beans.)**

**>>	IOC(Inversion of Control) : IOC means Inversion of Control. It means, rather than we creating the java objects, spring will create the objects.**

## Types of dependencies:
### Literal dependencies **(int i)**

### Object dependencies **(Object obj)**

### > Bean Creation
**<bean id="vehicle" class="com.transport.Bus" /\>** (using xml based configuration)

 ### Ways to inject dependencies:

 1. Setter Based Injections -
	 uses property inside the bean tag to inject dependencies via setter based injection.   
	**<bean id = "person" class = "com.example.Person"\>  <property name = "name" value = "Gagan Gaur"/\>       <bean\>**
	
 2. Constructor Based Injections -> **<constructor-arg value="10" type="int"\> </constructor-arg\>**

### Autowiring Concept
While using autowiring we don't need the property tag inside the bean tag to inject dependency spring will automatically inject the dependencies
> Autowire attribute values
1. byName
2. byType
3. constructor

#### 1. byName : 
**Mind `mind`** (inside person class variable of type Mind)

<bean id = "**mind**" class = "com.example.Mind"/\>
	
**<bean id = "person" class = "com.example.Person" autowire="byName"/\>**
	
Here mind is dependency of a person so here we are using **autowire** attribute value as **byName** so the id of mind bean should be same as the variable name of type mind in person class.

#### 2. byType :
**`Mind` mind** (inside person class variable of type Mind)

<bean id = "mind" class = "com.example.Mind"/\> (Here bean id can be anything)
	
**<bean id = "person" class = "com.example.Person" autowire="byType"/\>**

Here in this case the spring do not match the bean id with variable name as in above case but it matches the class name 

<bean id = "mind" class = "com.example.`Mind`"/\>

and injects the dependecy using **setter based injection**.

#### 3. constructor :

**<bean id = "person" class = "com.example.Person" autowire="constructor"/\>**
