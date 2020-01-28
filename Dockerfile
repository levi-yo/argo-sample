# 어떤 이미지로부터 새로운 이미지를 생성할 지 지정. 플랫폼 : 버전 형태로 작성
FROM adoptopenjdk/openjdk13:alpine-jre
# Dockerfile을 생성-관리하는 사람
MAINTAINER levi <1223yys@naver.com>
# 호스트의 directory를 docker 컨테이너에 연결. 즉 소스코드나 외부 설정파일을 커밋하지 않고 docker container에서 사용가능하도록 함
VOLUME /tmp
# 도커 이미지 생성시 실행
RUN mkdir -p /app/
# 파일이나 디렉토리를 docker image로 복사
ADD ./build/libs/argo-0.0.1-SNAPSHOT.jar /app/app.jar
# 외부에 노출할 포트 지정
EXPOSE 7070
CMD ["java", "-jar", "/app/app.jar", "--enable-preview"]

