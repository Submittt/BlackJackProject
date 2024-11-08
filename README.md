## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

---

# BlackJack Game Rules

## 블랙잭 게임 규칙

### 기본 규칙

1. **목적**

   - 카드를 더해 **21**을 맞추거나, 21에 최대한 가까운 점수를 만드는 것이 목표

2. **배팅**
   - 참가자는 게임이 시작되기 전에 배팅 금액을 설정

---

### 카드 점수

- **A (에이스)**: 1 또는 11 (상황에 따라 선택)
- **2-10**: 카드에 적힌 숫자와 동일
- **J (잭), Q (퀸), K (킹)**: 10점

---

### 게임 결과 및 배당률

| 결과          | 배당률         |
| ------------- | -------------- |
| 블랙잭 승리   | 배팅액의 1.5배 |
| 일반합 승리   | 배팅액의 1배   |
| 무승부 (Push) | 배팅액 반환    |
| 패배          | 배팅액 잃음    |

---

### 기본 규칙 설명

- **카드 지급**: 처음에 카드 2장을 지급받습니다.
- **승리 조건**: 카드의 합이 21에 가장 가까운 사람이 승리합니다.
- **히트(Hit)**: 21에 도달하지 못했을 경우 카드를 더 받을 수 있습니다.
- **버스트(Bust)**: 카드의 합이 21을 초과하면 패배합니다.

---

### 용어 설명

- **블랙잭**

  처음 받은 2장의 카드 합이 21일 때. 배팅 금액의 1.5배 획득

- **무승부 (Push)**

  플레이어와 딜러가 동시에 블랙잭일 경우 배팅 금액이 반환

- **히트 (Hit)**

  추가로 카드를 받는 행위. 21을 초과하지 않는 한 횟수 제한 없이 히트 가능

- **스탠드(Stand 또는 Stay)**

  더 이상 카드를 받지 않고 차례를 종료

- **스플릿 (Split)**

  처음 받은 두 장의 카드가 같은 숫자일 때, 두 패로 나눠서 독립된 게임으로 진행 가능하며 최대 4개까지 가능

- **더블 다운 (Double Down)**

  배팅을 두 배로 올리면서 카드 한 장만 더 받고 차례를 종료 (21을 초과하지 않는 경우에만 가능)

- **소프트 17 (Soft 17)**

  에이스(Ace)와 6의 조합으로 이루어진 합이 17이 되는 경우
  에이스는 1로도 11로도 집계가 가능하기에

  **소프트 17** 상황에서는 딜러는 추가 히트 (Hit) 진행 가능

- **서렌더 (Surrender)**
  포기 선언 후, 배팅 금액의 절반을 돌려받는다. 단, 딜러가 블랙잭일 경우 선언 불가

---

### 추가 규칙

- **원아이드 잭**

  스페이드 J, 하트 J가 포함된 블랙잭 조합으로, 일반 블랙잭보다 높은 등급

- **파이브 카드 찰리(Five Card Charlie)**

  카드 5장을 히트하여도 버스트가 되지 않았을 때 성립

- **식스 카드 찰리(Six Card Charlie)**
  카드 6장을 히트하여도 버스트가 되지 않았을 때 성립

---

### 족보 정리

- **족보 우선순위**
  일반합 21 < n-카드 찰리 < 블랙잭 < 원아이드 잭
- **플레이어만 찰리 규칙 적용**
  딜러가 찰리를 성립하면 버스트로 처리

---

## 블랙잭 플레이 흐름

### **Step 1. 배팅**

카드를 받기 전 룰에 따른 가능 범위 내의 배팅

---

### **Step 2. 딜러의 카드 배분**

1. 배팅이 완료 된 후 플레이어에게 한 장의 카드를 (숫자가 보이게) 배분
2. 딜러 자신에게 숫자가 보이지 않게 한 장의 카드를 배분
3. 추가로 각 플레이어에게 한 장의 카드를 (숫자가 보이게) 배분
4. 딜러 자신에게 숫자가 보이게 한 장의 카드를 배분

- **최종 배분 결과**

  플레이어 : 숫자가 보이는 카드 2장

  딜러 : 숫자가 보이는 카드 1장 / 보이지 않는 카드 1장

---

### **Step 3. 플레이어 턴**

보유한 핸드(패)에 따라서 플레이 방향을 결정한다

1. 블랙잭 (Blackjack)

   - **블랙잭**: 처음 두 장의 카드가 Ace와 10의 조합으로 합이 21일 경우
   - **딜러의 블랙잭 여부**: 딜러가 블랙잭이 아니면 즉시 승리
   - **배당**: 초기 배팅 금액의 **1.5배** 지급
   - **Push (무승부)**: 딜러도 블랙잭일 경우 배팅 금액 반환

2. 스탠드 (Stand)

   - **스탠드 선언**: 받은 카드로 승산이 충분할 때 추가 카드를 받지 않겠다고 선언

3. 히트 (Hit)

   - **히트 선택**: 더 높은 합계를 위해 추가 카드를 받음
   - **딜러 규칙**: 딜러는 21이 넘지 않는 한, 한 번에 한 장씩 플레이어에게 카드 제공
   - **제한**: 버스트(21 초과)가 되면 차례 종료

4. 더블 다운 (Double Down)

   - **더블 다운**: 단 한 장의 카드만 추가로 받고 더 이상의 카드를 받지 않으며 배팅을 두 배로 올리는 방식
   - **조건**: 자신의 패가 더블 다운에 유리할 때 선택
   - **딜러 규칙**: 추가 카드를 받을 수 없음을 표시하기 위해 카드를 가로 방향으로 제공

5. 스플릿 (Split)

   - **스플릿 선택**: 같은 값의 카드 2장을 받으면 두 번째 배팅으로 스플릿 가능
   - **카드 배분**: 딜러는 각 카드에 추가로 한 장씩 제공하여 두 개의 게임으로 나눔
   - **추가 배팅**: 첫 베팅 금액과 같은 금액을 추가로 배팅

6. 서렌더 (Surrender)
   - **서렌더 선택**: 처음 받은 패가 마음에 들지 않을 때 배팅의 절반을 돌려받고 게임을 포기

---

### **Step 4. 딜러 턴**

플레이어의 핸드(패)가 **버스트 or 서렌더** 선언이 되지 않았을 경우
딜러의 턴으로 진행하며

뒤집힌 카드를 오픈하여 카드의 합 확인

1. 딜러 핸드의 합이 **17 이상**이면 자동 스탠드(Stand)
2. 딜러 핸드의 합이 **16 이하**이면 자동 히트(Hit)
3. 더블다운(Double Down) 혹은 스플릿(Split)과 서렌더(Surrender) **선택 불가능**
4. 딜러는 기본적으로 선택의 여지 없이 패(핸드)의 합계에 따라 플레이

   단, **소프트 17(Soft 17)** 의 상황은 예외

---

### **Step 5. 결과 정산**

플레이어들과 딜러의 핸드플레이까지 완료되면 다음에 따라 **결과 정산**

1. 딜러의 버스트(Bust)
   생존 중인 플레이어의 각 패 마다 **배팅금액(1배수)** 지급

2. 딜러의 패(핸드)가 17~21 사이

   - 생존 중인 플레이어들의 패(핸드)를 비교하고 딜러보다 낮은 패를 가졌다면 **배팅금액(100%)** 을 잃는다

   - 더 높은 핸드를 가졌다면 **배팅금액(1배수)** 를 지불 받는다

   - 딜러와 같은 패(핸드)라면 푸시(Push)로 간주하여 **배팅금액을 잃지않는다**
