# Online Feature Store Demo

## 데이터 저장
피처 스토어는 다양한 데이터 소스에서 데이터를 추출 및 transform 과정을 진행하고 저장합니다.정재된 데이터는 ML 모델의 학습 및 서빙에 사용될 수 있다.

## 메타데이터 관리
피처 스토어는 피처와 관련된 메타데이터를 관리합니다. 이는 피처의 정의, 형식, 속성, 생성 방법 등을 포함할 수 있다.

## 버전 관리
피처 스토어는 피처의 다양한 버전을 관리한다. 이는 피처 데이터의 변경 이력을 추적하고, 이전 버전과의 비교 및 롤백을 가능하게 한다.

## 요구사항
1. Kafka event_log 토픽에 발생되는 데이터 중 특정 정보만 필터링하여 추출한다
2. event_log에서 발생된 데이터를 transform하여 적절한 토픽에 발행한다. (kafka Streams)
3. online feature store가 될 Redis에도 저장하도록 한다.
4. 여러타입의 이벤트 타입을 가진 event_log generator를 만들어 데이터를 임의로 발생시킨다.
5. 피처에 따른 버전관리가 되어야한다.
6. 데이터 손실이 일어나지 않도록 kafka 정책을 관리해야 한다. ex) retry
7. Redis에 적절한 Expire 정책을 도입하여 feature store를 관리한다.