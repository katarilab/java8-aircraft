docker build -t java8-aircraft:latest .
sudo docker tag java8-aircraft:latest f4phantom.skylab:5000/java8-aircraft:latest
sudo docker push f4phantom.skylab:5000/java8-aircraft:latest