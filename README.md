# calculator </br>
## LV1 
클래스 없이 계산기 구현하였습니다. </br>
정수인 숫자 두개와 연산 기호를 입력받으면 계산을 수행하고 결과를 출력합니다. </br>
결과를 출력하고 추가로 계산할 지 물어보고 계속 계산을 합니다.
</br>
## LV2
클래스를 적용하여 계산기를 구현하였습니다.</br>
App클래스는 유저가 직접 사용하는 부분이라 생각하였고, Calculator 클래스에서 실제로 연산을 하고 결과를 내보냅니다. </br>
Calculator 클래스에 memory라는 이름의 리스트를 만들어 결과값을 저장하도록 만들었습니다.
</br>
## LV3
4개의 연산자를 모두 클래스로 만들어 구현하였습니다.</br>
generic을 사용하여 사용자가 입력한 값이 정수가 아니고 실수여도 연산이 가능하도록 하였습니다.</br>
memory에 결과값을 저장하고 memory에 저장된 결과값을 index와 값을 넣어 변경할 수 있는 기능 추가하였습니다.</br>
memory에 저장된 결과를 모두 보여주는 기능을 추가하였습니다.</br>
stream과 람다를 이용하여 연산이 완료된 후 memory에서 결과값보다 큰 값들과 낮은 값들을 출력하는 기능을 추가하였습니다.</br>
BadInputException과 BadRangeInputException이라는 커스텀 예외처리를 추가하였습니다.</br>
BadInputException은 사용자가 입력한 숫자, 연산자가 올바르지 않는경우를 처리합니다.</br>
BadRangeInputException은 memory에서 저장된 결과값을 수정할때 Index의 크기가 memory의 (size-1)값보다 큰 경우를 처리합니다</br>

