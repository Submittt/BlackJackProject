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

## BlackJack Game Rules

### 블랙잭 게임 규칙

---

#### 기본 규칙

1. **목적**

   - 카드를 더해 **21**을 맞추거나, 21에 최대한 가까운 점수를 만드는 것이 목표

2. **배팅**
   - 참가자는 게임이 시작되기 전에 배팅 금액을 설정

---

#### 카드 점수

- **A (에이스)**: 1 또는 11 (상황에 따라 선택)
- **2-10**: 카드에 적힌 숫자와 동일
- **J (잭), Q (퀸), K (킹)**: 10점

---

#### 게임 결과 및 배당률

| 결과          | 배당률         |
| ------------- | -------------- |
| 블랙잭 승리   | 배팅액의 1.5배 |
| 일반합 승리   | 배팅액의 1배   |
| 무승부 (Push) | 배팅액 반환    |
| 패배          | 배팅액 잃음    |

---

#### 기본 규칙 설명

- **카드 지급**: 처음에 카드 2장을 지급받습니다.
- **승리 조건**: 카드의 합이 21에 가장 가까운 사람이 승리합니다.
- **히트(Hit)**: 21에 도달하지 못했을 경우 카드를 더 받을 수 있습니다.
- **버스트(Bust)**: 카드의 합이 21을 초과하면 패배합니다.

---

#### 용어 설명

- **블랙잭**

  - 처음 받은 2장의 카드 합이 21일 때. 배팅 금액의 1.5배 획득

- **무승부 (Push)**

  - 플레이어와 딜러가 동시에 블랙잭일 경우 배팅 금액이 반환

- **히트 (Hit)**

  - 추가로 카드를 받는 행위. 21을 초과하지 않는 한 횟수 제한 없이 히트 가능

- **스탠드(Stand 또는 Stay)**

  - 더 이상 카드를 받지 않고 차례를 종료

- **스플릿 (Split)**

  - 처음 받은 두 장의 카드가 같은 숫자일 때, 두 패로 나눠서 독립된 게임으로 진행 가능하며 최대 4개까지 가능

- **더블 다운 (Double Down)**

  - 배팅을 두 배로 올리면서 카드 한 장만 더 받고 차례를 종료 (21을 초과하지 않는 경우에만 가능)

- **서렌더 (Surrender)**
  - 포기 선언 후, 배팅 금액의 절반을 돌려받는다. 단, 딜러가 블랙잭일 경우 선언 불가

---

#### 추가 규칙

- **원아이드 잭**

  - 스페이드 J, 하트 J가 포함된 블랙잭 조합으로, 일반 블랙잭보다 높은 등급

- **파이브 카드 찰리(Five Card Charlie)**

  - 카드 5장을 히트하여도 버스트가 되지 않았을 때 성립합니다.

- **식스 카드 찰리(Six Card Charlie)**
  - 카드 6장을 히트하여도 버스트가 되지 않았을 때 성립합니다.

#### 족보 정리

- **족보 우선순위**
  - 일반합 21 < n-카드 찰리 < 블랙잭 < 원아이드 잭
- **플레이어만 찰리 규칙 적용**
  - 딜러가 찰리를 성립하면 버스트로 처리
