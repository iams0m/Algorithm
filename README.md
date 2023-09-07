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

</details>

</br>

`to be updated..`
