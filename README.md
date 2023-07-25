# First KMM Project: Notes App

1. Structure of KMM Project.
   KMM projects have 3 major components:
   a. Native Android Module
   b. Native IoS Module
   c. Shared Module
   The shared module basically contains the business logic that is to be shared by the android as
   well as the ios application. So the dependencies that must be used in the shared module must be
   kotlin libraries that support KMM. for this project sqlDelight is used as the local database as
   it supports kmm.
2. Within the shared module, there us androidMain, commonMain and iosMain directories. The major
   reason for this distinction is that the androidMain and iosMain contains code that is shared but
   differs a bit as per the platform.