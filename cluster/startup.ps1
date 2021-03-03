kubectl apply -f deployment.yaml -n sut
kubectl get pods -n sut -o wide


Write-host '========================= Services  SUT =============================='
kubectl get services -n sut -o wide


Write-host '========================= Endpoints SUT =============================='
kubectl get endpoints -n sut -o wide 