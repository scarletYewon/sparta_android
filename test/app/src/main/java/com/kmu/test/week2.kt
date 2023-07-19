package com.kmu.test

//2주차
fun main(){
    rpg()
    world()
}

fun output(){
    println("안녕하세요")
    println("나는 코틀린이 좋아요")
    print("나는 코틀린으로 앱을 만들거예요")
    println("고마워요!")
    println("굿럭!")
}

fun input(){
    val dataString = readLine()
    println("나는 ${dataString }를 입력했어요!")
}

fun intInput(){
    val dataNumber = readLine()!!.toInt()
    val sum = dataNumber + 3
    println("입력은 ${dataNumber}인데 3을 더해서 ${sum }이예요!")
}

fun variable(){
    // var num1:Int = 1
    // var 변수이름:자료형(생략가능) = 값
    // 값을 특정 자료형을 저장할 수 있는 변수이름에 대입한다
    var num1 = 1
    println("내 첫변수 num1 변수에는 ${num1}이 들어있어")
    num1 = 5
    println("변경한 변수 num1 변수에는 ${num1}이 들어있어")

    // var one1:Char = '김'
    // var 변수이름:타입(생략가능) = 값
    var one1 = '김'
    println("내 첫변수 one1 변수에는 ${one1 }이 들어있어")
    one1 = '나' // one1변수에 들어있던 '김' 대신에 '나'를 대입
    println("변경한 변수 one1 변수에는 ${one1}가 들어있어")

    // var name:String = "참새"
    var name = "참새"
    println("새의 이름을 저장하는 name 변수에는 ${name}가 들어있어")
    name = "조롱박이" // name변수에 들어있던 "참새" 대신에 "조롱박이"를 대입
    println("변경한 변수 name에는 ${name}가 들어있어")
}

fun rpg(){
    val worldName = "스코월드"
    var myName = "스코뉴비"
    var myAge = 15
    var myJob = "마법사"

    println("==================${worldName}에 오신것을 환영합니다==================")
    println("당신의 정보는 다음과 같습니다.")
    println("이름: ${myName}입니다.")
    println("나이: ${myAge}입니다.")
    println("직업: ${myJob}입니다.")
    println("모험을 떠나 볼까요?")
}

//사칙연산자
fun cal6_1(){
    var num1 = 30
    var num2 = 10

    // 덧셈 연산자(+)사용해서 num1과 num2를 더한후에 plusResult에 대입함
    var plusResult = num1 + num2
    println("num1 + num2는 ${plusResult}이야")

    // 뺄셈 연산자(-)사용해서 num1에서 num2를 뺀후에 minusResult에 대입함
    var minusResult = num1 - num2
    println("num1 - num2는 ${minusResult}이야")

    // 곱셈 연산자(*)사용해서 num1과 num2를 곱한후에 multipleResult에 대입함
    var multipleResult = num1 * num2
    println("num1 * num2는 ${multipleResult}이야")

    // 나눗셈 연산자(/)사용해서 num1에서 num2를 나눈후에 divideResult에 대입함
    var divideResult = num1 / num2
    println("num1 / num2는 ${divideResult}이야")

    // num2를 10에서 7로 변경
    num2 = 7

    // 나머지 연산자(%)사용해서 num1에서 num2를 나눈 나머지를 modResult에 대입함
    var modResult = num1 % num2
    println("num1 % num2는 정수로 ${modResult}야")
}

//대입연산자
fun cal6_2(){
    // = 기준으로
    // 오른쪽: "참새"
    // 왼쪽의 이름: name
    // 즉, "참새"를 name변수에 대입한다라고 읽을 수 있음
    var name = "참새"
    println("내 이름은 ${name}")

    // = 기준으로
    // 오른쪽: 10
    // 왼쪽의 이름: age
    // 즉, 10을 age변수에 대입한다라고 읽을 수 있음
    val age = 10
    println("내 나이는 ${age}")
}

//복합대입연산자
fun cal6_3(){
    var num1 = 30
    var num2 = 10

    // 산술연산자와 대입연산자를 따로 사용
    // num1의 값을 10 증가시켜서 40을 만들고 싶다면?
    num1 = num1 + 10
    println("산술, 대입 따로 적용한 결과 ${num1}")

    // 복합대입연산자를 사용
    // num2의 값을 10 증가시켜서 20을 만들고 싶다면?
    num2 += 10
    println("산술, 대입 따로 적용한 결과 ${num2}")

    // 뺄셈, 곱셈, 나눗셈, 나머지연산도 동일하게 사용가능해요
    // 뺄셈: a-=b
    // 곱셈: a*=b
    // 나눗셈: a/=b
    // 나머지: a%=b
}

//증감연산자
fun cal6_4(){
    var num1 = 30
    var num2 = 10

    // num1의 값을 1 증가시키고 싶다면?

    // 1) 산술연산자, 대입연산자 따로 사용
    num1 = num1 + 1
    println("(num1_1): 산술,대입 연산자 따로 사용해서 1증가 ${num1}")

    // 2) 복합대입연산자 사용
    num1 += 1
    println("(num1_2): 복합대입연산자 사용해서 1증가 ${num1}")

    // 3) 증감 연산자
    num1++
    println("(num1_3): 증가연산자 사용해서 1증가 ${num1}")

    println("====================================================")

    // num2의 값을 1 감소시키고 싶다면?

    // 1) 산술연산자, 대입연산자 따로 사용
    num2 = num2 - 1
    println("(num2_1): 산술,대입 연산자 따로 사용해서 1감소 ${num2}")

    // 2) 복합대입연산자 사용
    num2 -= 1
    println("(num2_2): 복합대입연산자 사용해서 1감소 ${num2}")

    // 3) 증감 연산자
    num2--
    println("(num2_3): 증가연산자 사용해서 1감소 ${num2}")
}

//전위후위
fun cal6_5(){
    var num1 = 10
    var num2 = 20
    var num3 = 30

    // 후위연산자는 println연산을 실행후에 증감해요
    println(num1++)
    println(num1)

    // 전위연산자는 println연산 실행전에 증감해요
    println(++num2)
    println(num2)

    num3++
    println(num3)

    ++num3
    println(num3)
}

//비교연산자
fun cal6_6(){
    // 수학은 94점
    var mathScore = 94

    // 수학점수가 90점 초과인지 판단
    var isMathHighRank = mathScore > 90

    // 90점 초과라면 true (참)
    // 90점 이하라면 false (거짓)
    println("내 수학점수는 고등급이 맞나요? ${isMathHighRank}")
}
fun cal6_7(){
    // 영어는 60점
    var englishScore = 60

    // 국어점수가 60점 이상인지 판단
    var isEnglishMiddleRank = englishScore >= 60

    // 60점 이상이라면 true (참)
    // 60점 미만이라면 false (거짓)
    println("내 영어점수는 턱걸이로 중위권이 맞나요? ${isEnglishMiddleRank}")
}
fun cal6_8(){
    var baseAge = 20
    var myAge = 20
    var teacherAge = 50
    var babyAge = 7

    var isMyAgePass = myAge == baseAge
    var isTeacherAgePass = teacherAge == baseAge
    var isBabyAgeNoPass = babyAge != baseAge

    println("어서오세요~")
    println("이번 이벤트는 ${baseAge}살만 참여할 수 있습니다!")

    println("================신분증 검사중================")

    println("내 나이는 ${myAge}니까 ${isMyAgePass}다!")
    println("선생님 연세는 ${teacherAge}니까 ${isTeacherAgePass}네요.. 미안해요!")
    println("${babyAge}살은 참여할수 없는게 맞아요! ${isBabyAgeNoPass}")
}

fun ifState1(){
    var eventName = "참새"
    var myName = "참새"

    if(myName == eventName) {
        println("환영합니다 ${myName}님! 이벤트에 당첨됐어요!")
    } else {
        println("환영합니다 ${myName}님!")
    }
}
fun ifState2(){
//    티켓 100개가 전부 매진되면 더 이상 구매할 수 없다고 알림창을 띄워줘요의 예시입니다.

    var ticketCount = 0

    if(ticketCount > 0) {
        println("티켓을 구매했어요")
    } else {
        println("티켓이 모두 매진되었습니다")
    }
}
fun ifState3(){
    var koreanScore = 88
    var englishScore = 92
    var mathScore = 99
    var average = (koreanScore + englishScore + mathScore) / 3

    if(average >= 90) {
        println("당신의 등급은 A입니다")
    } else if(average >= 80) {
        println("당신의 등급은 B입니다")
    } else if(average >= 70) {
        println("당신의 등급은 C입니다")
    } else {
        println("당신의 등급은 F입니다")
    }
}
fun ifState4(){
    var todayNumber = readLine()!!.toInt()

    when(todayNumber) {
        1 -> {
            println("재물이 들어올것입니다")
        }
        2 -> {
            println("검정색을 조심하세요")
        }
        3 -> {
            println("지인과의 관계에 조심하세요")
        }
        else -> {
            println("물을 조심하십시오...")
        }
    }
}

fun forState(){
    // 1부터 10까지 변화하는 i변수
    for(i in 1..10) {
        println("${i}번째: 내 이름은 참새")
    }
}

fun whileState(){
    var i = 0

    while(i < 10) {
        println("${i}번째: 내 이름은 참새")
        i++
    }
}
fun forState2(){
    var infos = arrayOf("꿩", "닭", "참새", "오목눈이", "공작새")

    for(info in infos) {

        if(info == "참새") {
            println("찾았다 참새!")
            break
        } else {
            continue
        }
    }
}
fun forState3(){
    var catStatus = false
    println("고양이는 매우 배고픕니다..")
    println("사료를 10번 먹여주세요")


    // 고양이가 현재 배고프니까(false) 사료 배급가능
    if(catStatus == false) {
        for(idx in 0..9) {
            println("${idx}번째: 냠냠")
        }
    }

    // 사료를 10번 준 이후의 상태변화
    catStatus = true
    if(catStatus == true) {
        println("배부른 고양이입니다")
    }
}

fun world(){
    val worldName = "스코월드"
    var myName = readLine()
    var myAge = readLine()!!.toInt()
    var myJob = readLine()

    var isNamePass = true
    var isAgePass = true
    var isJobPass = true

    var names = arrayOf("참새", "꿩", "비둘기")
    for(name in names) {
        if(myName == name) {
            println("중복된 이름이 존재합니다.")
            isNamePass = false
            break
        }
    }

    if(myAge < 12) {
        println("12세 미만은 이용할 수 없습니다.")
        isAgePass = false
    }
    if(myJob == "전사") {
        println("일시적으로 전사를 이용할 수 없습니다.")
        isJobPass = false
    }

    // 모든 조건을 통과한 경우에만 환영
    if(isNamePass && isAgePass && isJobPass) {
        println("==================${worldName}에 오신것을 환영합니다==================")
        println("당신의 정보는 다음과 같습니다.")
        println("이름: ${myName}입니다.")
        println("나이: ${myAge}입니다.")
        println("직업: ${myJob}입니다.")
        println("모험을 떠나 볼까요?")
    }
}