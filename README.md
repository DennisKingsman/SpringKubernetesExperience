# Author 
## DennisKingsman
# Resources
[youtube-guide](https://www.youtube.com/watch?v=aH1IwAPHe1w&ab_channel=TEKE)
#Recomended to stuby
[docker-hub-vvedenie](https://itgap.ru/post/docker-hub-vvedenie)  
[spring-boot-minikube](https://www.baeldung.com/spring-boot-minikube)  
# Process
Step 1  
Download Homebrew  
[brew.sh](https://brew.sh/index_ru)  
Download microkube  
Download kubectl  
Use brew or  
[install-minikube](https://kubernetes.io/ru/docs/tasks/tools/install-minikube/)  
[install-kubectl](https://kubernetes.io/ru/docs/tasks/tools/install-kubectl/#%D1%83%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%B2%D0%BA%D0%B0-kubectl-%D0%B2-linux)  
Step 2  
Create a simple rest service  
Build jar with `mvn install`  
Create and build dockerfile  
Step 3  
Push docker image to dockerHub repo with  
```
docker tag local-image:tagname new-repo:tagname
docker push new-repo:tagname 

docker push denniskzkingsman/kuber-mcs-first-try:denniskingsman/lucky-app
```
[hub.docker](https://hub.docker.com/repository/docker/denniskzkingsman/kuber-mcs-first-try)  
