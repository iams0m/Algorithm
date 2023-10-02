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

<br>

## 위상 정렬 (Topological sort)
위상 정렬 (Topological sort) : 사이클이 없는 방향 그래프에서 노드 순서를 찾는 알고리즘
 - 두 노드 A, B 사이에 A ➡️ B 관계 성립
 - A ➡️ B, B ➡️ A 처럼 그래프들 사이에 사이클 존재 X

<br>
<b>[특징]</b>
<br>

- 진입 차수 배열을 이용한 정렬
- 항상 유일한 값으로 정렬 X
  - 한 단계에서 큐에 새롭게 들어가는 원소가 2개 이상인 경우가 있다면 여러가지 답이 존재할 수 있다! 
- 사이클이 존재하면, 노드 간의 순서를 명확하게 정의할 수 없으므로 위상 정렬 적용 불가
  - DAG(Direct Acyclic Graph, 순환하지 않는 방향 그래프)에 대해서만 수행할 수 있다!
- 모든 원소를 방문하기 전에 큐가 빈다면, 사이클이 존재한다고 판단할 수 있다.
  - 사이클에 포함된 원소 중, 어떠한 원소도 큐에 들어가지 못한다!
- 스택을 활용한 DFS(Depth-First Search)를 이용해 위상 정렬 수행 가능
- 시간 복잡도 : O(V + E) ➡️ 노드 수 : V, 에지 수 : E

<br>

### 위상 정렬의 핵심 이론

위상 정렬 이론에 앞서 진입 차수를 이해해야 합니다.
- 진입 차수 : 자기 자신을 가리키는 에지의 개수

#### 큐를 이용한 위상 정렬 알고리즘의 동작 과정

1. 그래프의 각 노드들의 진입 차수 테이블을 생성하고, 진입 차수를 계산한다.

2. 진입 차수가 0인 노드를 큐에 넣는다. (이때 어떤 노드 먼저 시작하든 관계 X)

3. 큐에서 노드를 하나 꺼낸 후, 꺼낸 노드와 간선으로 연결된 노드들의 진입 차수를 1씩 뺀다. (진입 차수 테이블 갱신)

4. 진입 차수 테이블을 갱신한 후, 진입 차수의 값이 0인 노드가 있다면 큐에 넣는다. (없으면 아무것도 하지 않음)

5. 과정 3 ~ 4를 큐에 더 이상 아무것도 없을 때까지 반복한다.

<br>

## 다익스트라 (Dijkstra)
다익스트라 (Dijkstra) : 출발 노드와 **그 외 노드 간의 최단 거리**를 구하는 알고리즘
 - 에지는 모두 양수
 - 시간 복잡도 : O(ElogV) ➡ 노드 수 : V, 에지 수 : E

<br>

### 다익스트라 알고리즘의 핵심 이론

#### 인접 리스트를 이용한 다익스트라 알고리즘의 동작 과정

1. 인접 리스트로 그래프 구현하기(데이터를 자료구조에 저장)
    - 시간 복잡도와 N의 크기를 고려해 인접 리스트로 구현하는 것이 좋음
    - 인접 리스트에 연결한 배열의 자료형 ➡ (노드, 가중치) 형태로 선언하여 연결

2. 최단 거리 배열 초기화하기
    - 최단 거리 배열을 만들고 출발 노드는 0, 이외의 노드는 무한으로 초기화
    - 무한 : 적당히 큰 값

3. 값이 가장 작은 노드 고르기
    - 최단 거리 배열에서 현재 값이 가장 작은 노드 선택
    - 처음 : 시작 노드 선택

4. 최단 거리 배열 업데이트
    - 선택된 노드에 연결된 에지의 값을 바탕으로 다른 노드의 값 업데이트
    - 과정 1에 저장해 놓은 연결 리스트를 이용해 현재 선택된 노드의 에지들을 탐색하고 업데이트
    - 연결 노드의 최단 거리 : 두 값 중 더 작은 값으로 업데이트

5. 모든 노드가 처리될 때까지 과정 3 ~ 4를 반복해 최단 거리 배열 완성하기
   - 과정 4에서 **선택 노드가 될 때마다 다시 선택되지 않도록 방문 배열을 만들어 처리**
   - 모든 노드가 선택될 때까지 반복하면 최단 거리 배열 완성

<br>

## 벨만-포드 (Bellman-Ford)
- 특정 출발 노드에서 다른 모든 노드까지의 최단 경로 탐색

<br>
<b>[특징]</b>
<br>

- 음수 가중치 에지가 있어도 수행할 수 있음
- 전체 그래프에서 음수 사이클의 존재 여부 판단 가능
- 시간 복잡도 : O(VE) ➡ 노드 수 : V, 에지 수 : E

<br>

### 벨만-포드 알고리즘의 핵심 이론

벨만-포드 알고리즘은 다음 3가지 단계의 원리로 동작합니다.

1.  에지 리스트로 그래프를 구현하고 최단 경로 리스트 초기화하기
    - 벨만-포드 알고리즘은 에지를 중심으로 동작하므로 그래프를 에지 리스트로 구현
    - edge 클래스 : 노드 변수 2개와 가중치 변수로 구성

2. 모든 에지를 확인해 정답 리스트 업데이트하기
    - 최단 거리 리스트에서 업데이트 반복 횟수 : 노드 개수 - 1
    - 노드 개수가 N이고, 음수 사이클이 없을 때 특정 두 노드의 최단 거리를 구성할 수 있는 에지의 최대 개수 : N - 1
    - 모든 에지 E = (s, e, w)에서 다음 조건을 만족하면 업데이트 실행
       - 업데이트 반복 횟수가 K번이면, 해당 시점에 정답 리스트의 값은 시작점에서 K개의 에지를 사용했을 때 각 노드에 대한 최단 거리
     
    `업데이트 조건과 방법`
    - D[s] != ∞ 이며 D[e] > D[s] + w ➡ D[e] = D[s] + w로 리스트 값 업데이트
    - 음수 사이클이 없을 때 N - 1번 에지 사용 횟수를 반복하면 출발 노드와 모든 노드 간의 최단 거리를 알려주는 정답 리스트 완성
    - 완성 후, 마지막으로 그래프에 음수 사이클 존재 여부 확인

3. 음수 사이클 유무 확인하기
   - 모든 에지를 한 번씩 다시 사용하여 업데이트 되는 노드가 발생하는지 확인
      - 업데이트 되는 노드가 있다면, 음수 사이클 존재 ➡ 정답 리스트 무의미, 최단 거리를 찾을 수 없는 그래프 

<br>

## 플로이드-워셜 (Floyd-Warshall)
그래프에서 최단 거리를 구하는 알고리즘
- 모든 노드 간의 최단 경로 탐색

<br>
<b>[특징]</b>
<br>

- 음수 가중치 에지가 있어도 수행 가능
- 동적 계획법의 원리를 이용해 알고리즘 접근
   - A 노드에서 B 노드까지 최단 경로를 구했다고 가정했을 때, 최단 경로 위에 K노드가 존재한다면 그것을 이루는 부분 경로 역시 최단 경로 
- 시간 복잡도 : O(V^3) ➡ 노드 수 : V

### 플로이드-워셜 알고리즘의 핵심 이론

플로이드-워셜 알고리즘은 다음 3가지 단계의 원리로 동작합니다.

1.  리스트를 선언하고 초기화하기
    - D[S][E] : 노드 S에서 노드 E까지의 최단 거리를 저장하는 리스트
    - S와 E의 값이 같은 칸(자기 자신에게 가는 데 걸리는 최단 경로 값) : 0으로 초기화
    - S와 E의 값이 다른 칸 : ∞으로 초기화

2. 최단 거리 리스트에 그래프 데이터 저장하기
    - 출발 노드(S), 도착 노드(E), 가중치(W) 라고 가정하고 D[S][E] = W로 에지의 정보를 리스트에 입력하여 인접 행렬로 표현

3. 점화식으로 리스트 업데이트하기
   - 점화식을 3중 for문 형태로 반복하면서 리스트 값 업데이트
   - `플로이드-워셜 점화식` : D[S][E] = Math.min(D[S][E], D[S][K] + D[K][E])

   `플로이드-워셜 알고리즘 로직`

       for 경유지 K에 관해 (1 ~ N) # N : 노드 개수

         for 출발 노드 S에 관해 (1 ~ N)

          for 도착 노드 E에 관해 (1 ~ N)

           D[S][E] = Math.min(D[S][E], D[S][K] + D[K][E])

<br>

## 최소 신장 트리 (MST)
그래프에서 모든 노드를 연결할 때 사용된 에지들의 가중치의 합을 최소로 하는 트리

<br>
<b>[특징]</b>
<br>

- 사이클이 포함되면 가중치의 합이 최소가 될 수 없으므로 사이클을 포함하지 않는다.
- N개의 노드가 있으면, 최소 신장 트리를 구성하는 에지의 개수는 항상 N - 1개이다.

### 최소 신장 트리 알고리즘의 핵심 이론

1.  에지 리스트로 그래프를 구현하고 유니온 파인드 리스트 초기화하기
    - 최소 신장 트리는 데이터를 노드가 아닌 에지 중심으로 저장 ➡️ 인접 리스트가 아닌 에지 리스트의 형태로 저장
    - 에지 리스트는 일반적으로 노드 변수 2개와 가중치 변수로 구성
    - 사이클 처리를 위한 유니온 파인드 리스트도 함께 초기화 ➡️ 리스트의 인덱스를 해당 자리 값으로 초기화 

2. 그래프 데이터를 가중치 기준으로 정렬하기
    - 에지 리스트에 담긴 그래프 데이터를 가중치 기준으로 **오름차순 정렬**

3. 가중치가 낮은 에지부터 연결 시도하기
   - 에지를 연결했을 때 그래프에 사이클 형성 유무를 find 연산을 이용해 확인(대표 노드가 같으면, 두 노드를 연결했을 때 사이클 형성) ➡️ 사이클이 형성되지 않으면, union 연산을 이용해 두 노드 연결

4. `과정 3` 반복하기
   - 전체 노드의 개수가 N개이면, 연결한 에지의 개수가 N - 1이 될 때까지 과정 3 반복 

5. 총 에지 비용 출력하기
   - 에지의 개수가 N - 1이 되면 알고리즘 종료 ➡️ 완성된 최소 신장 트리의 총 에지 비용 출력

</details>

<br>

<details>
 <summary>Tree</summary>
</br>

## 트리 알아보기
트리 : 노드와 에지로 연결된 **그래프의 특수한 형태**

<br>
<b>[특징]</b>
<br>

- 순환 구조 X, 1개의 루트 노드 존재 ➡️ 트리에서 임의의 두 노드를 이어주는 경로는 유일
- 루트 노드를 제외한 노드는 단 1개의 부모 노드를 가짐
- 부분 트리 역시 트리의 모든 특징을 따름

### 트리의 구성 요소

  `노드` : 데이터의 index와 value를 표현하는 요소
  
  `에지` : 노드와 노드의 연결 관계를 나타내는 선
  
  `루트 노드` : 트리에서 가장 상위에 존재하는 노드
  
  `부모 노드` : 두 노드 사이의 관계에서 상위 노드에 해당하는 노드
  
  `자식 노드` : 두 노드 사이의 관계에서 하위 노드에 해당하는 노드
  
  `리프 노드` : 트리에서 가장 하위에 존재하는 노드(자식 노드가 없는 노드)
  
  `서브 트리` : 전체 트리에 속한 작은 트리

## 이진 트리 (Binary Tree)(⭐⭐⭐)

💡 트리 영역에서 가장 많이 사용되는 형태

각각의 노드가 최대 두 개의 자식 노드를 가지는 트리 자료 구조

- 자식 노드 : 왼쪽 자식 노드와 오른쪽 자식 노드로 구성

### 이진 트리의 핵심 이론

#### 이진 트리 종류

  `편향 이진 트리` : 노드들이 한쪽으로 편향돼 생성된 이진 트리
  
  `포화 이진 트리` : 트리의 높이가 모두 일정하며 리프 노드가 꽉 찬 이진 트리
  
  `완전 이진 트리` : 마지막 레벨을 제외하고 완전하게 노드들이 채워져 있고, 마지막 레벨은 왼쪽부터 채워진 트리

#### 이진 트리의 순차 표현

가장 직관적이면서 편리한 트리 자료구조 형태 : 1차원 배열

**[트리의 노드와 배열의 인덱스 사이 상관 관계]**

|이동 목표 노드|인덱스 연산|제약 조건(N = 노드 개수)|
|------|---|---|
|루트 노드|index = 1||
|부모 노드|index = index / 2|현재 노드 ≠ 루트 노드|
|왼쪽 자식 노드|index = index * 2|index * 2 ≤ N|
|오른쪽 자식 노드|index = index * 2 + 1|index * 2 + 1 ≤ N|

</details>

<br>

`to be updated..`
