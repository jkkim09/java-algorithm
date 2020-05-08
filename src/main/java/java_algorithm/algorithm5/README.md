# JAVA ALGORITHM 5
### 문제

준규가 사는 나라는 우리가 사용하는 연도와 다른 방식을 이용한다. 준규가 사는 나라에서는 수 3개를 이용해서 연도를 나타낸다. 각각의 수는 지구, 태양, 그리고 달을 나타낸다.
지구를 나타내는 숫자를 E, 태양을 나타내는 숫자를 S, 달을 나타내는 숫자를 M이라고 했을 때, 이 세 수는 서로 다른 범위를 가진다. (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
우리가 알고있는 1년은 준규가 살고있는 나라에서는 1 1 1로 나타낼 수 있다. 1년이 지날 때마다, 세 수는 모두 1씩 증가한다. 만약, 어떤 수가 범위를 넘어가는 경우에는 1이 된다.
예를 들어, 15년은 15 15 15로 나타낼 수 있다. 하지만, 1년이 지나서 16년이 지나면 16 16 16이 아니라 1 16 16이 된다. 이유는 1 ≤ E ≤ 15 라서 범위를 넘어가기 때문이다.
E, S, M이 주어졌고, 1년이 준규가 사는 나라에서 1 1 1일때, 준규가 사는 나라에서 E S M이 우리가 알고 있는 연도로 몇 년인지 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 세 수 E, S, M이 주어진다. 문제에 나와있는 범위를 지키는 입력만 주어진다.

### 출력

첫째 줄에 E S M으로 표시되는 가장 빠른 연도를 출력한다. 1 1 1은 항상 1이기 때문에, 정답이 음수가 나오는 경우는 없다.

# Code

`````java
`````

# 풀이
## Info

#### BufferedReader 
Java를 처음 접하시는 분들이 주로 받는 입력방식은 Scanner입니다. Scanner를 통해 입력을 받을경우 Space Enter를 모두 경계로 인식하기에 입력받은 데이터를 가공하기 매우 편리합니다. 하지만 그에비해 BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 String으로 고정되기때문에 입력받은 데이터를 가공하는 작업이 필요할경우가 많습니다. Scanner에 비해 다소 사용하기 불편하죠. 하지만 많은 양의 데이터를 입력받을경우 BufferedReader를 통해 입력받는 것이 효율면에서 훨씬 낫습니다. 입력시 Buffer 메모리줌으로써 작업속도 차이가 많이납니다.



####  BufferedReader 사용법

`````java
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
String s = bf.readLine(); //String
int i = Integer.parseInt(bf.readLine()); //Int
`````

 선언은 위에 있는 예제와 같이 하시면 됩니다. 입력은 readLine();이라는 메서드를 활용하시면 되는데요. 여기서 주의할점이 두가지가 있습니다. 첫번째는 readLine()시 리턴값을 String으로 고정되기에 String이 아닌 다른타입으로 입력을 받을려면 형변환을 꼭 해주어야한다는 점입니다. 두번째는 예외처리를 꼭 해주어야한다는 점입니다. readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업합니다.



#### Read한 데이터 가공

`````java
StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
int a = Integer.parseInt(st.nextToken()); //첫번째 호출
int b = Integer.parseInt(st.nextToken()); //두번째 호출
String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
`````

 Read한 데이터는 Line단위로만 나눠지기에 공백단위로 데이터를 가공하려면 따로 작업을 해주어야하는데요. 위의 두가지 방법이 대표적입니다. 첫번째 방법으로는 StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있습니다. 두번째방법으로는 String.split()함수를 활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용하는 방식입니다.



####  BufferedWriter 
일반적으로 출력을할때 System.out.println(""); 방식을 사용하고는 합니다. 적은양의 출력일 경우 성능차이가 미미하겠지만 많은 양의 출력에서는 입력과 마찬가지로 Buffer를 활용해주시는것이 좋습니다.



####  BufferedWriter 사용법
`````java
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
String s = "abcdefg";//출력할 문자열
bw.write(s+"\n");//출력
bw.flush();//남아있는 데이터를 모두 출력시킴
bw.close();//스트림을 닫음
`````

BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야합니다. 그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야합니다.

### 분석

### func1



