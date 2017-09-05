cd dependencies
echo "=========building dependencies=================="
for i in `ls`
do
cd $i 
mvn clean install -DskipTests=true
cd ..
done

echo "=========building codes=================="
mvn clean package -DskipTests=true

cd xbin-support-docker

docker --version
if [ $? ne 0]
then
curl -s https://get.docker.com/ |sudo sh
fi

docker-compose --version
if [ $? -ne 0]
then
pip install docker-compose
fi

echo "=========starting the dockers=================="
docker-compose up -d

# visit http://localhost:8104/login, username:zhangsan password:123456

