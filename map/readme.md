# Map
hashmap과 treemap을 많이 이용합니다. 이 중에 압도적으로 **Hashmap**을 이용하고, 면접 또한 **Hashmap**에서 많이 나오게 됩니다.
* Hashmap은 equal query가 들어올 때 사용합니다.
* Treemap은 range query가 들어올 때 사용합니다. range query는 2가지로 분류할 수 있습니다.
 * **a보다 크거나 같고, b보다 작거나 같은 key**들을 모두 구한다.
 * **lower_bound, upper_bound** 등의 연산  

# Question
면접에서 물어볼 수 있는 것들은 아래와 같습니다.
* hashmap에서 rehashing이 왜 필요한가요? [모범답안](https://codingdog.tistory.com/127)
* 왜 equals를 overriding 하면 hashcode 함수를 재정의 해야 하나요? [모범답안](https://codingdog.tistory.com/211)
* hashcode의 리턴 값이 모두 같다면 어떤 일이 일어나나요? [모범답안](https://codingdog.tistory.com/216)