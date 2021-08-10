# Author 
## DennisKingsman
# Resources
[youtube-guide](https://www.youtube.com/watch?v=aH1IwAPHe1w&ab_channel=TEKE)
# Recomended to stuby
[youtube-lecture](https://www.youtube.com/watch?v=1xo-0gCVhTU&ab_channel=JamesQuigley)
[docker-hub-vvedenie](https://itgap.ru/post/docker-hub-vvedenie)   
[spring-boot-minikube](https://www.baeldung.com/spring-boot-minikube)  
# Process
## Step 1  
Download Homebrew  
[brew.sh](https://brew.sh/index_ru)  
Download microkube  
Download kubectl  
Use brew or  
[install-minikube](https://kubernetes.io/ru/docs/tasks/tools/install-minikube/)  
[install-kubectl](https://kubernetes.io/ru/docs/tasks/tools/install-kubectl/#%D1%83%D1%81%D1%82%D0%B0%D0%BD%D0%BE%D0%B2%D0%BA%D0%B0-kubectl-%D0%B2-linux)  
## Step 2  
Create a simple rest service  
Build jar with `mvn install`  
Create and build dockerfile  
## Step 3  
Push docker image to dockerHub repo with  
```
docker tag local-image:tagname new-repo:tagname
docker push new-repo:tagname 

docker push denniskzkingsman/kuber-mcs-first-try:denniskingsman/lucky-app
```
[hub.docker](https://hub.docker.com/repository/docker/denniskzkingsman/kuber-mcs-first-try)  
## Step 4  
Start minikube and then enter command  
```
kubectl create deployment luckyapp --image=denniskzkingsman/kuber-mcs-first-try
```
and create deployment and pod  
also you may check  
```
kubectl get pods
kubectl get replicasets
kubectl describe pod luckyapp
minikube dashboard
kubectl get deployments -o wide
kubectl delete --all deployments
```
## Step 5  
Create deployment using yaml file `kubectl apply -f lucky-app-deployment.yaml `  
[yaml file](https://gist.github.com/karimessouabni/407404100906da1e7751443ffb171875)  
Check if minikube has no load balancer integrated?  
## Step 6  
Testing app in kuber  
Enter to cmd  
```
minikube tunnel

kubectl expose deployment lucky-app-deployment --name=lucky-app-service --port=80 --target-port=8080 --type=LoadBalancer

kubectl get service  
```
copy the EXTERNAL-IP and pass it to the browther with context-path  
It's done! Congratulations!
