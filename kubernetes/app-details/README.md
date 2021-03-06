# app details

Run this application as standalone application

Requirements
1. Python3
2. Pip3
```
pip3 install flask
python3 app.py
```
open http://localhost:5001 or http://localhost:5001/details

Steps to run this application on kubernetes cluster

Create docker image

`
docker build . -t app-details:1.0
`

to run this application as a standalone docker container

`
docker run -p 5001:5001 app-details:1.0
`

to run this application as a standalone pod

`
kubectl apply -f kubernetes\app-details-pod.yaml
`

to run this application with help of replication controller

`
kubectl apply -f kubernetes\app-details-rc.yaml
`

to run this application with help of replica set

`
kubectl apply -f kubernetes\app-details-rs.yaml
`

to run this application with help of deployment

`
kubectl apply -f kubernetes\app-details-deploy.yaml
`

to create a new namespace

`
kubectl apply -f kubernetes\app-details-namespace.yaml
`

to expose this application to outside cluster

`
kubectl apply -f kubernetes\app-details-svc.yaml
`

to check the application open http://localhost:30001 or http://<node_ip>:30001

application has exposed one api http://localhost:30001/details
