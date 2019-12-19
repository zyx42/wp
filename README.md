# Wizards Powers
An application designed to keep tabs on those who wield the most fearsome powers within the existing universe.
In it's core it's a simple SPA (Single-Page Application) which utilizes Vue.js and GraphQl to achieve its functionality.

Wizard powers was decomposed into three main modules:
#### Wizardpowers Backend
It's written with Spring Boot and Java implementation of GraphQl, thus it 
provides all necessary endpoints for CRUD operations with wizards.

#### Wizardpowers Frontend
Written with Vue.js, it uses vue router to achieve functionality of a Single-Page Application and 
apollo server to send GraphQl calls to manipulate data.

#### Wizardpowers Database
Separately running PostgreSQL database.
