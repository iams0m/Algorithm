# Algorithm
### 백준 알고리즘 문제풀이와 기본적인 알고리즘 및 자료구조에 대한 Github입니다.<br>
### 모든 코드는 JAVA를 활용하여 작성하였습니다.
> <b>알고리즘 소스 코드 출처</b> <br>
Github - https://github.com/kdgyun/Sorting_Algorithm<br>
Inflearn 하루코딩 - Do it! 알고리즘 코딩테스트 with JAVA https://bit.ly/DoItJAVA

# NOTE

<details>
 <summary>SortingAlgorithm</summary>
</br>

## QuickSort
* 기준값(pivot)을 선정해 해당 값보다 작은 데이터와 큰 데이터로 분류하는 것을 반복해 정렬하는 알고리즘
* 평균 시간 복잡도 : O(nlog n)
* 최악의 경우 시간 복잡도 : O(n^2)

</br>

### 퀵 정렬 과정
1. 데이터를 분할하는 pivot을 설정한다.
2. pivot을 기준으로 다음 ⅰ ~ ⅴ 과정을 거쳐 데이터를 2개의 집합으로 분리한다.
   
> - 1. start가 가리키는 데이터가 pivot이 가리키는 데이터보다 작으면 start를 오른쪽으로 1칸 이동한다.<br>
> - 2. end가 가리키는 데이터가 pivot이 가리키는 데이터보다 크면 end를 왼쪽으로 1칸 이동한다.<br>
> - 3. start가 가리키는 데이터가 pivot이 가리키는 데이터보다 크고, end가 가리키는 데이터가 pivot이 가리키는 데이터보다 작으면 start, end가 가리키는 데이터를 swap하  고 start는 오른쪽, end는 왼쪽으로 1칸씩 이동한다.<br>
> - 4. start와 end가 만날 때까지 a ~ c를 반복한다.<br>
> - 5. start와 end가 만나면 만난 지점에서 가리키는 데이터와 pivot이 가리키는 데이터를 비교하여 pivot이 가리키는 데이터가 크면 만난 지점의 오른쪽에, 작으면 만난 지점의 왼쪽에 pivot이 가리키는 데이터를 삽입한다.<br>

3. 분리 집합에서 각각 다시 pivot을 선정한다.
4. 분리 집합이 1개 이하가 될 때까지 과정 1 ~ 3을 반복한다.
   
<br>

## MergeSort(⭐⭐⭐)
* 분할 정복(Divide and Conquer) 방식을 사용해 데이터를 분할하고 분할한 집합을 정렬하며 합치는 알고리즘
* 정렬해야 할 리스트가 주어지면 해당 리스트를 분할을 반복하여 최대한 작게 쪼개진 시점에 부분 리스트에서 인접한 원소들끼리 비교하여 정렬하는 방식
* 데이터를 '비교'하면서 찾기 때문에 '비교 정렬'이며 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하기 때문에 '제자리 정렬(in-place sort)'이 아니다.
* 최대한 작게 문제를 쪼개어 앞의 부분 리스트부터 차례대로 합쳐나가기 때문에 안정 정렬(Stable Sort) 알고리즘이기도 하다.
* 평균 시간 복잡도 : O(nlog n)

</br>

### 병합 정렬 과정
1. 주어진 리스트를 절반으로 분할하여 부분 리스트로 나눈다. (Divide : 분할)

2. 해당 부분 리스트의 길이가 1이 아니라면 1번 과정을 되풀이한다.

3. 인접한 부분 리스트끼리 정렬하여 합친다. (Conqure : 정복)

<img src="https://github.com/iams0m/Algorithm/assets/105639531/c2152e13-68e4-4174-a047-50d11f484e16.gif"/>

<br>

## RadixSort
* 정렬하려는 숫자들을 자릿수 별로 비교하면서 정렬하는 방식
* 대량의 데이터를 효율적으로 정렬할 수 있는 알고리즘
* 추가적인 메모리를 필요로 하며, 정렬할 수 있는 데이터 타입이 제한적 ➡ 소수점이 붙거나, 숫자가 아닐 경우 사용할 수 없음
* 시간 복잡도 : O(kn) ➡ k : 데이터의 자릿수

</br>

### 기수 정렬 과정
1. 정렬할 숫자들을 가장 작은 자릿수부터 가장 큰 자릿수까지 반복하여 정렬한다.

2. 각 자릿수를 기준으로 숫자를 그룹화 한다.

3. 가장 작은 자릿수부터 그룹화한 숫자들을 순서대로 다시 합친다.

4. 가장 큰 자릿수까지 반복하여 정렬이 완료될 때까지 1-3 과정을 반복한다.

</details>

<br>

<details>
 <summary>SearchAlgorithm</summary>
</br>
 
## DFS (Depth-First Search, 깊이 우선 탐색)(⭐⭐⭐)
* 그래프 완전 탐색 기법 중 하나 ➡ 그래프의 모든 노트를 탐색하는 기법
* 그래프의 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정해 최대 깊이까지 탐색을 마친 후, 다른 쪽 분기로 이동하여 다시 탐색을 수행하는 알고리즘
* 미로를 탐색할 때 한 방향으로 갈 수 있을 때까지 계속 가다가 더 이상 갈 수 없게 되면 다시 가장 가까운 갈림길로 돌아와서 이곳으로부터 다른 방향으로 다시 탐색을 진행하는 방법과 유사
* 깊이 우선 탐색은 실제 구현 시 재귀 함수를 이용하므로 스택 오버플로(stack overflow) 유의하기 ➡ 무한 루프에 빠질 위험이 있음
* 깊이 우선 탐색을 응용하여 풀 수 있는 문제 : 단절점 찾기, 단절선 찾기, 사이클 찾기, 위상 정렬 등
* 스택에 노드를 삽입할 때 방문 배열을 체크하고, 스택에서 노드를 뺄 때 탐색 순서에 기록하며 인접 노드를 방문 배열과 대조하여 살펴봄
* 시간 복잡도 : O(V + E) ➡ 노드 수 : V, 에지 수 : E

</br>

### 깊이 우선 탐색 과정
1. DFS를 시작할 노드를 정한 후 사용할 자료구조 초기화하기

2. 스택에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 스택에 삽입하기

3. 스택 자료구조에 값이 없을 때까지 1-2를 반복하기
    - 이미 다녀간 노드는 방문 배열을 바탕으로 재삽입하지 않는 것이 핵심

<br>

## BFS (Breadth-First Search, 너비 우선 탐색)(⭐⭐⭐)
* 그래프 완전 탐색 기법 중 하나 ➡ 그래프의 모든 노트를 탐색하는 기법
* 그래프의 시작 노드에서 출발하여 시작 노드를 기준으로 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘 ➡ 꼼꼼하게 좌우를 살피며 다니자 ! 
* 한 단계씩 깊이를 더해가며 해당 깊이에 있는 모든 정점을 방문해 나가다가 더 이상 방문할 곳이 없을 때 탐색 종료
* 너비 우선 탐색을 응용하여 풀 수 있는 문제 : 두 노드 사이의 최단 경로 혹은 임의의 경로를 구하는 경우
* 큐에 노드를 삽입할 때 방문 배열을 체크하고, 큐에서 노드를 뺄 때 탐색 순서에 기록하며 인접 노드를 방문 배열과 대조하여 살펴봄
* 시간 복잡도 : O(V + E) ➡ 노드 수 : V, 에지 수 : E

</br>

### 너비 우선 탐색 과정
1. BFS를 시작할 노드를 정한 후 사용할 자료구조 초기화하기
    - DFS와 마찬가지로 방문했던 노드는 다시 방문하지 않으므로 방문한 노드를 체크하기 위한 배열 필요
    - 그래프를 인접 리스트로 표현하는 것 역시 DFS와 동일
    - 차이점이 있다면 탐색을 위해 스택이 아닌 <b>큐</b>를 사용
2. 큐에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 큐에 삽입하기

3. 큐 자료구조에 값이 없을 때까지 1-2를 반복하기
    - 이미 다녀간 노드는 방문 배열을 바탕으로 재삽입하지 않는 것이 핵심
  
<br>

## 이진 탐색(Binary Search)
* <b>데이터가 정렬돼 있는 상태에서</b> 원하는 값을 찾아내는 알고리즘
* 대상 데이터의 중앙값과 찾고자 하는 값을 비교해 데이터의 크기를 절반씩 줄이면서 대상을 찾음 ➡ 중앙값 비교를 통한 대상 축소 방식
* 시간 복잡도 : O(logN)

</br>

### 이진 탐색 과정
[오름차순]
1. 현재 데이터셋의 중앙값(median) 선택

2. 중앙값 > 타깃 데이터(target data) ⇒ 중앙값 기준으로 왼쪽 데이터셋 선택

3. 중앙값 < 타깃 데이터(target data) ⇒ 중앙값 기준으로 오른쪽 데이터셋 선택

4. 과정 1 ~ 3을 반복하다가 중앙값 == 타깃 데이터 일 때 탐색 종료

[내림차순]
1. 현재 데이터셋의 중앙값(median) 선택

2. 중앙값 > 타깃 데이터(target data) ⇒ 중앙값 기준으로 오른쪽 데이터셋 선택

3. 중앙값 < 타깃 데이터(target data) ⇒ 중앙값 기준으로 왼쪽 데이터셋 선택

4. 과정 1 ~ 3을 반복하다가 중앙값 == 타깃 데이터 일 때 탐색 종료

</details>

<br>

<details>
 <summary>Greedy Algorithm</summary>
</br>

## 그리디 알고리즘(Greedy Algorithm)
* 현재 상태에서 보는 선택지 중 최선의 선택지가 전체 선택지 중 최선의 선택지라고 가정하는 알고리즘
* 현재 조건에서 선택을 했다면, 더 이상 다른 선택 가능 경우 검증 X ➡ 최적의 해 보장 X

</br>

### 그리디 알고리즘 수행 과정

그리디 알고리즘은 다음과 같은 3단계를 반복하면서 문제를 해결합니다.

1. 해 선택 : 현재 상태에서 가장 최선이라고 생각되는 해를 선택한다.

2. 적절성 검사 : 현재 선택한 해가 전체 문제의 제약 조건에 벗어나지 않는지 검사한다.

3. 해 검사 : 현재까지 선택한 해 집합이 전체 문제를 해결할 수 있는지 검사한다. 전체 문제를 해결하지 못한다면, 1로 돌아가 같은 과정을 반복한다.
  
<br>

</details>

</br>

<details>
 <summary>Number Theory</summary>
</br>

## 소수 구하기
* 소수 : 1과 자기 자신 외에 약수가 존재하지 않는 수
* 소수 구하기 핵심 이론 : <b>에라토스테네스의 체</b>

</br>

### 에라토스테네스의 체란?
* 소수(Prime Number)를 판별하는 알고리즘
* 대량의 소수를 한꺼번에 판별하고자 할 때 사용
* 시간 복잡도 : O(Nlog(logN))
<br>

### 에라토스테네스의 체 수행 과정

에라토스테네스의 체는 다음과 같은 3단계를 반복하면서 소수를 구할 수 있습니다.

1. 구하고자 하는 소수의 범위만큼 1차원 배열을 생성한다.

2. 2부터 시작하고 현재 숫자가 지워지지 않을 때는 현재 선택된 숫자의 배수에 해당하는 수를 배열에서 끝까지 탐색하면서 제거한다. 이때, 처음으로 선택된 숫자는 지우지 않는다.

3. 배열의 끝까지 과정 2를 반복한 후, 배열에 남아 있는 모든 수를 출력한다.

<br>

## 오일러 피(Euler's Totient)
* 1부터 N까지 범위에서 N과 서로소인 자연수의 개수
> 서로소 관계: 두 수 a, b의 공약수가 1뿐인 두 정수를 의미

</br>

### 오일러 피 함수의 원리

오일러 피 함수의 원리는 에라토스테네스 체와 비슷합니다.

1. 구하고자 하는 오일러 피의 범위만큼 배열을 자기 자신의 인덱스 값으로 초기화한다.

2. 2부터 시작해 현재 배열의 값과 인덱스가 같으면(= 소수일 때,  N = ϕ(N)), 현재 선택된 숫자(K)의 배수에 해당하는 수를 배열의 끝까지 탐색하며 <b>ϕ[i] = ϕ[i] - ϕ[i]/K</b> 연산을 수행한다.(i는 K의 배수)

3. 배열의 끝까지 과정 2를 반복한 후, 오일러 피 함수를 완성한다.

<br>

## 유클리드 호제법(Euclidean Algorithm)
* 두 수의 <b>최대공약수(GCD : Greatest Common Divisor)</b>를 찾기 위한 알고리즘
  
💡 <b>재귀 형태로 구현</b>
  - b가 0이라면 a가 최대공약수가 되며, 그렇지 않으면 b와 a % b의 최대공약수를 구합니다.
  - 이를 재귀적으로 반복하여 최대공약수를 구할 수 있습니다.

💡 <b>반복문 방식으로 구현</b>
  - 먼저 b가 0이 될 때까지 a를 b로 나눈 나머지를 b에 대입하고, a와 b의 값을 교환합니다.
  - 이를 반복하여 최대공약수를 구할 수 있습니다.

</br>

### 유클리드 호제법의 핵심 이론

MOD 연산을 이해하면 다음과 같은 3단계로 유클리드 호제법을 구현할 수 있습니다.

> MOD 연산 : 두 값을 나눈 나머지를 구하는 연산

1. 큰 수를 작은 수로 나누는 MOD 연산을 수행한다.

2. 앞 단계에서의 작은 수와 MOD 연산 결괏값(나머지)으로 MOD 연산을 수행한다.

3. 2단계를 반복하다가 나머지가 0이 되는 순간의 작은 수를 최대공약수로 선택한다.

</details>

<br>

<details>
 <summary>Graph Algorithm</summary>
</br>

## 그래프의 표현(⭐⭐⭐)
그래프 : 노드와 에지로 구성된 집합
 - 노드 : 데이터를 표현하는 단위, 정점
 - 에지 : 노드 간 연결선

<br>

그래프를 구현하는 3가지 방법이 있다.

### 에지 리스트
- 에지를 중심으로 그래프 표현
- 배열에 출발 노드, 도착 노드를 저장하여 에지를 표현 또는 출발 노드, 도착 노드, 가중치를 저장하여 가중치가 있는 에지를 표현
<br>
<b>[특징]</b>
<br>

- 구현이 쉽다.
- 특정 노드와 관련되어 있는 에지를 탐색하기는 쉽지 않다.
- 에지 리스트는 벨만 포드나 크루스칼 알고리즘에 사용되며, 노드 중심 알고리즘에서 잘 사용되지 않는다.

#### 에지 리스트로 가중치가 없는 그래프 표현하기
- 가중치가 없는 그래프는 출발 노드와 도착 노드만 표현 -> 배열의 열 2개 충분
- 노드는 여러 자료형 사용 가능

#### 에지 리스트로 가중치가 있는 그래프 표현하기
- 가중치가 있는 그래프는 열을 3개로 늘려 3번째 열에 가중치 저장

<br>

### 인접 행렬
- 2차원 배열을 자료구조로 이용하여 그래프 표현
- 에지리스트와 다르게 노드 중심으로 그래프 표현
<br>
<b>[특징]</b>
<br>

- 구현이 쉽다.
- 두 노드를 연결하는 에지의 여부와 가중치값을 배열에 직접 접근하면 바로 확인할 수 있다.
- <b>But,</b> 노드와 관련되어 있는 에지를 탐색하려면 N번 접근해야하므로 노드 개수에 비해 에지가 적을 때는 공간 효율성이 떨어진다.
- 노드 개수가 많은 경우, 아예 2차원 배열 선언 자체를 할 수 없는 결함도 있다.
- 따라서 인접 행렬은 노드 개수에 따라 사용 여부를 적절히 판단하는 능력이 필요하다.
- ex) 노드 > 30000 ➡️ 자바 힙 스페이스 에러 발생!

#### 인접 행렬로 가중치가 없는 그래프 표현하기
1에서 2를 향하는 에지 : 1행 2열에 1 저장(가중치가 없기 때문에 1 저장)
- ‘1에서 2로 향하는 에지가 있다’는 표시를 <b>노드 중심</b>으로 하는 인접 행렬

#### 인접 행렬로 가중치가 있는 그래프 표현하기
2에서 5로 향하는 에지의 가중치를 2행 5열에 기록

<br>

### 인접 리스트(⭐⭐⭐)
- ArrayList로 그래프 표현
- 노드 개수만큼 ArrayList 선언
- 자료형은 경우에 맞게 사용
<br>
<b>[특징]</b>
<br>

- 노드와 연결되어 있는 에지를 탐색하는 시간이 매우 뛰어남(시작 노드를 배열 형태로 선언해주었기 때문)
- 노드 개수가 커도 <b>공간 효율이 좋아</b> 메모리 초과 에러가 발생하지 않음
- 여러 장점으로 실제 그래프 알고리즘에서 에지 중심보다 노드 중심으로 도는 알고리즘이 많다!

#### 인접 리스트로 가중치가 없는 그래프 표현하기
N번 노드와 연결되어 있는 노드를 배열의 위치 N에 연결된 노드 개수만큼 배열을 연결하는 방식으로 표현

#### 인접 리스트로 가중치가 있는 그래프 표현하기(⭐⭐⭐)
- 가중치가 있는 경우, 자료형을 클래스로 사용 
- (도착 노드, 가중치)를 갖는 Node 클래스를 선언하여 ArrayList에 사용 ➡️ ArrayList<Node>[N]
- ex) A[시작 노드의 index].add(new Node(도착 노드, 가중치))

<br>

## 유니온 파인드 (Union-Find)
유니온 파인드(union-find) : 일반적으로 여러 노드가 있을 때 특정 2개의 노드를 연결해 1개의 집합으로 묶는 **union 연산**과 두 노드가 같은 집합에 속해 있는지를 확인하는 **find 연산**으로 구성되어 있는 알고리즘

<br>

### 유니온 파인드의 핵심 이론

유니온 파인드는 union, find 연산을 완벽히 이해하는 것이 핵심이다.

#### union, find 연산
- union 연산
    - 각 노드가 속한 집합을 1개로 합치는 연산
    - 노드 a, b가 a ∈ A, b ∈ B 일 때 union(a, b)는 A ∪ B
- find 연산
    - 특정 노드 a에 관해 a가 속한 집합의 대표 노드를 반환하는 연산
    - 노드 a가 a ∈ A 일 때 find(a)는 A 집합의 대표 노드를 반환
 
 <br>

 ### 유니온 파인드의 원리 이해하기

 1. 유니온 파인드를 표현하는 일반적인 방법은 1차원 배열을 이용하는 것 ! 처음에는 노드가 연결되어 있지 않으므로 각 노드가 대표 노드 ! ⇒ 자신의 인덱스 값으로 초기화
 2. 2개의 노드를 선택해 각각의 **대표 노드를 찾아 연결**하는 union 연산 수행
 3. find 연산은 자신이 속한 집합의 대표 노드를 찾는 연산 ➡️ 그래프를 정돈하고 경로 압축 효과가 나타나 시간 복잡도를 향상 시키는 아주 중요한 부분!
⭐**경로 압축** : 실제 그래프에서 여러 노드를 거쳐야 하는 경로에서 그래프를 변형해 더 많은 경로로 갈 수 있도록 함으로써 시간 복잡도를 효과적으로 줄이는 방법

#### find 연산의 작동 원리
1. 대상 노드 배열에 index 값과 value 값이 동일한지 확인한다.
2. 동일하지 않으면, value 값이 가리키는 index 위치로 이동한다. ➡️ 동일하면, 대표 노드
3. 이동 위치의 index 값과 value 값이 같을 때까지(대표 노드를 찾을 때까지) 과정 1 ~ 2를 반복한다.(재귀 함수)
4. 대표 노드에 도달하면, ⭐재귀 함수를 빠져나오면서 거치는 모든 노드 값을 루트 노드 값(대표 노드의 value)으로 변경한다.

</details>

<br>

`to be updated..`
