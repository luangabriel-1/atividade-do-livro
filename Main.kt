fun main() {
    print("Digite a data no formato ddmmaa: ")
    val data = readLine()?.toIntOrNull() ?: 0

    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100

    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}
// 26
fun main() {
    print("Digite data no formato DDMMAA: ")
    val data = readLine()?.toIntOrNull() ?: 0
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    val ndata = mes * 10000 + dia * 100 + ano

    println("\nDIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
    println("\nDATA NO FORMATO MMDDAA: $ndata")
}
// 27
fun main() {
    var x = 2
    var y = 5

    println("\nx = $x")
    x++
    println("\ny = $y")
    y--
    println("\nnovo valor de x = $x")
    println("\nnovo valor de y = $y")
}
// 28
fun main() {
    println("É PRECISO FAZER TODOS OS ALGORITMOS PARA APRENDER")
}

// 29
fun main() {
    println("Seu Nome") // Substitua pelo seu nome, se desejar
}
// 30
fun main() {
    val produto = 28 * 43
    println("O produto entre os dois e: $produto")
}

// 31
fun main() {
    val ma = (8 + 9 + 7) / 3.0
    println("A media aritmetica e: $ma")
}

// 32
fun main() {
    print("Entre com um numero: ")
    val num = readLine()?.toIntOrNull() ?: 0
    println("numero $num")
}

// 33
fun main() {
    print("Entre com um numero: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Entre com outro numero: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    println("numero 1: $num1")
    println("numero 2: $num2")
}

// 34
fun main() {
    print("Entre com um numero: ")
    val numero = readLine()?.toIntOrNull() ?: 0
    val ant = numero - 1
    val sue = numero + 1

    println("O sucessor e $sue, o antecessor e $ant")
}

// 35
fun main() {
    print("Entre com nome: ")
    val nome = readLine() ?: ""
    print("Entre com endereco: ")
    val endereco = readLine() ?: ""
    print("Entre com telefone: ")
    val telefone = readLine() ?: ""

    println("\n\n\n")
    println("Nome: $nome")
    println("Endereco: $endereco")
    println("Telefone: $telefone")
}

// 36
fun main() {
    print("Entre com um numero: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Entre com outro numero: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    val soma = num1 + num2

    println("Soma: $soma")
}

// 37
fun main() {
    print("Entre com um numero: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Entre com outro numero: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    val prod = num1 * num2

    println("produto: $prod")
}

// 38
fun main() {
    print("Entre com um numero com ponto: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0
    val terca = num / 3
    println("A terca parte e: $terca")
}

// 39
fun main() {
    print("Digite 1a nota: ")
    val nota1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2a nota: ")
    val nota2 = readLine()?.toDoubleOrNull() ?: 0.0
    val media = (nota1 + nota2) / 2
    println("media: $media")
}

// 40
fun main() {
    print("Entre com o dividendo: ")
    val val1 = readLine()?.toIntOrNull() ?: 0
    print("Entre com divisor: ")
    val val2 = readLine()?.toIntOrNull() ?: 1
    val quoc = val1 / val2
    val rest = val1 % val2

    println("\n\n")
    println("dividendo: $val1")
    println("divisor: $val2")
    println("quociente: $quoc")
    println("resto: $rest")
}

// 41
fun main() {
    print("Entre com 1 numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entre com 2 numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entre com 3 numero: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entre com 4 numero: ")
    val d = readLine()?.toDoubleOrNull() ?: 0.0

    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("media ponderada: $mp")
}
// 42
import kotlin.math.*

fun main() {
    print("Digite um angulo em graus: ")
    val angulo = readLine()?.toDoubleOrNull() ?: 0.0
    val rang = Math.toRadians(angulo)

    println("seno: ${sin(rang)}")
    println("co-seno: ${cos(rang)}")
    println("tangente: ${tan(rang)}")
    println("co-secante: ${1 / sin(rang)}")
    println("secante: ${1 / cos(rang)}")
    println("cotangente: ${1 / tan(rang)}")
}

// 43
import kotlin.math.log10

fun main() {
    print("Entre com o logaritmando: ")
    val num = readLine()?.toDoubleOrNull() ?: 1.0
    val logaritmo = log10(num)
    println("logaritmo: $logaritmo")
}

// 44
import kotlin.math.log

fun main() {
    print("Entre com o logaritmando: ")
    val num = readLine()?.toDoubleOrNull() ?: 1.0
    print("Entre com a base: ")
    val base = readLine()?.toDoubleOrNull() ?: 10.0
    val logaritmo = log(num, base)

    println("O logaritmo de $num na base $base e: $logaritmo")
}

// 45
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite numero: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0
    val quad = num.pow(2)
    val raizquad = sqrt(num)

    println("numero: $num")
    println("quadrado: $quad")
    println("raiz quadrada: $raizquad")
}

// 46
fun main() {
    print("Digite saldo: ")
    val saldo = readLine()?.toDoubleOrNull() ?: 0.0
    val nsaldo = saldo * 1.01
    println("novo saldo: $nsaldo")
}

// 47
fun main() {
    print("Entre com um numero de 3 digitos: ")
    val num = readLine()?.toIntOrNull() ?: 0
    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c

    println("numero: $num")
    println("invertido: $num1")
}

// 48
fun main() {
    print("Entre com o salario minimo: ")
    val sm = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entre com a quantidade em quilowatt: ")
    val qtdade = readLine()?.toDoubleOrNull() ?: 0.0

    val preco = sm / 700
    val vp = preco * qtdade
    val vd = vp * 0.9

    println("preco do quilowatt: $preco")
    println("valor a ser pago: $vp")
    println("valor com desconto: $vd")
}

// 49
fun main() {
    print("Entre com nome: ")
    val nome = readLine() ?: ""

    if (nome.isNotEmpty()) {
        println("todo nome: $nome")
        println("primeiro caractere: ${nome.first()}")
        println("ultimo caractere: ${nome.last()}")
        println("primeiro ao terceiro caractere: ${nome.take(3)}")
        println("quarto caractere: ${if (nome.length >= 4) nome[3] else "N/A"}")
        println("todos menos o primeiro: ${nome.drop(1)}")
        println("os dois ultimos: ${nome.takeLast(2)}")
    }
}

// 50

fun main() {
    print("Digite base: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base * base + altura * altura)

    println("perimetro = $perimetro")
    println("area = $area")
    println("diagonal = $diagonal")
}

// 51

fun main() {
    print("Digite raio: ")
    val raio = readLine()?.toDoubleOrNull() ?: 0.0

    val perimetro = 2 * PI * raio
    val area = PI * raio * raio

    println("perimetro : $perimetro")
    println("area : $area")
}

// 52

fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0

    val perimetro = 4 * lado
    val area = lado * lado
    val diagonal = lado * sqrt(2.0)

    println("perimetro: $perimetro")
    println("area: $area")
    println("diagonal: $diagonal")
}

// 53
fun main() {
    print("Entre com a base: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entre com a altura: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entre com a profundidade: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    val diagonal = sqrt(a * a + b * b + c * c)

    println("diagonal : $diagonal")
}

// 54
fun main() {
    print("Entre com a base: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entre a altura do triangulo: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    val area = (a * b) / 2
    println("Area = $area")
}

// 55
fun main() {
    print("Medida da diagonal maior: ")
    val diagmaior = readLine()?.toDoubleOrNull() ?: 0.0
    print("Medida da diagonal menor: ")
    val diagmenor = readLine()?.toDoubleOrNull() ?: 0.0

    val area = (diagmaior * diagmenor) / 2
    println("area = $area")
}

// 56
fun main() {
    print("Digite nome: ")
    val nome = readLine() ?: ""
    print("Digite idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    println("\n\n")
    println("nome = $nome")
    println("idade = $idade")
}

// 57

fun main() {
    print("Digite pr1: ")
    val pr1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite pr2: ")
    val pr2 = readLine()?.toDoubleOrNull() ?: 0.0

    val mf = (pr1 + pr2) / 2

    val truncada = floor(mf).toInt()
    val arredondada = mf.roundToInt()

    println("media truncada= $truncada")
    println("media arredondada= $arredondada")
}

//58
fun main() {
    print("Entrar com 1 valor: ")
    val xnum1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entrar com 2 valor: ")
    val xnum2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entrar com 3 valor: ")
    val xnum3 = readLine()?.toDoubleOrNull() ?: 0.0

    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + log(64.0, 2.0)
    println("X = $x")
}

// 59
fun main() {
    print("Entrar com 1 cateto: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entrar com 2 cateto: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    val a = sqrt(b * b + c * c)
    println("A hipotenusa e: $a")
}

// 60
fun main() {
    print("Entrar com o 1o termo: ")
    val termo = readLine()?.toIntOrNull() ?: 0
    print("Entrar com a razao: ")
    val razao = readLine()?.toIntOrNull() ?: 0

    val dec = termo + 9 * razao
    println("O 10 termo desta P.A. e: $dec")
}

// 61
import kotlin.math.pow

fun main() {
    print("Entre com o 1o termo: ")
    val termo = readLine()?.toIntOrNull() ?: 0
    print("Entre com a razao: ")
    val razao = readLine()?.toIntOrNull() ?: 0

    val quinto = (termo * razao.toDouble().pow(4.0)).toInt()
    println("O 5o termo desta P.G. e: $quinto")
}

//62
fun main() {
    print("Digite valor do produto: ")
    val preco = readLine()?.toDoubleOrNull() ?: 0.0

    val npreco = preco * 0.91
    println("preco com desconto: $npreco")
}

// 63
fun main() {
    print("horas trabalhadas: ")
    val na = readLine()?.toIntOrNull() ?: 0
    print("valor da hora-aula: ")
    val vha = readLine()?.toDoubleOrNull() ?: 0.0
    print("percentual de desconto: ")
    val pd = readLine()?.toDoubleOrNull() ?: 0.0

    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td

    println("salario liquido: $sl")
}

// 64
fun main() {
    print("digite o valor da temperatura em graus centigrados: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    val f = (9 * c + 160) / 5
    println("o valor da temperatura em graus fahrenheit e = $f")
}

// 65
fun main() {
    print("digite a altura da lata: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite o raio da lata: ")
    val raio = readLine()?.toDoubleOrNull() ?: 0.0

    val volume = PI * raio.pow(2) * altura
    println("o volume da lata e= $volume")
}

// 66
fun main() {
    print("digite o tempo gasto: ")
    val tempo = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite a velocidade media: ")
    val vel = readLine()?.toDoubleOrNull() ?: 0.0

    val dist = tempo * vel
    val litros = dist / 12

    println("velocidade = $vel, tempo = $tempo, distancia = $dist, litros = $litros")
}

//67
fun main() {
    print("digite o valor da prestacao: ")
    val valor = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite a taxa: ")
    val taxa = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite o tempo (numero de meses): ")
    val tempo = readLine()?.toIntOrNull() ?: 0

    val prest = valor + (valor * (taxa / 100) * tempo)
    println("o valor da prestacao em atraso e = $prest")
}

// 68
fun main() {
    print("digite 1 numero com ponto: ")
    var a = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite 2 numero com ponto: ")
    var b = readLine()?.toDoubleOrNull() ?: 0.0

    val aux = a
    a = b
    b = aux

    println("a = $a, b = $b")
}

// 69
fun main() {
    print("digite numerador: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite denominador: ")
    val denom = readLine()?.toDoubleOrNull() ?: 1.0

    val decimal = num / denom
    println("decimal: $decimal")
}

// 70
fun main() {
    print("Entre com o valor da conta: ")
    val cres = readLine()?.toDoubleOrNull() ?: 0.0

    val cgorj = cres * 1.1
    println("O valor da conta com a gorjeta sera: %.2f".format(cgorj))
}

//71

fun main() {
    print("entre com hora atual: ")
    val hora = readLine()?.toIntOrNull() ?: 0
    print("entre com minutos: ")
    val minuto = readLine()?.toIntOrNull() ?: 0

    val tminuto = hora * 60 + minuto
    println("Ate agora se passaram: $tminuto minutos")
}

// 72
fun main() {
    print("entre com deposito: ")
    val deposito = readLine()?.toDoubleOrNull() ?: 0.0
    print("entre com a taxa de juros: ")
    val taxa = readLine()?.toDoubleOrNull() ?: 0.0

    val valor = deposito * taxa / 100
    val total = deposito + valor

    println("Rendimentos: $valor, Total: $total")
}

// 73
import kotlin.math.floor
import kotlin.math.roundToInt

fun main() {
    print("entre com um numero com parte fracionaria: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0

    val numi = floor(num - 0.5).toInt()
    val numfrac = num - numi
    val numa = (num + 0.00001).roundToInt()

    println("parte inteira: $numi")
    println("parte fracionaria: ${"%.3f".format(numfrac + 0.00001)}")
    println("numero arredondado: $numa")
}

// 74
fun main() {
    print("entre com o salario minimo: ")
    val salmin = readLine()?.toDoubleOrNull() ?: 1.0
    print("entre com o salario da pessoa: ")
    val salpe = readLine()?.toDoubleOrNull() ?: 0.0

    val num = salpe / salmin
    println("a pessoa ganha $num salarios minimos")
}

//75
fun main() {
    print("entre com seu peso, so a parte inteira: ")
    val peso = readLine()?.toIntOrNull() ?: 0

    val pesogramas = peso * 1000
    val novopeso = pesogramas * 1.12

    println("peso em gramas: $pesogramas")
    println("novo peso: $novopeso")
}

//76
fun main() {
    print("digite numero: ")
    val num = readLine()?.toIntOrNull() ?: 0

    val sucessor = (num + 1) % 61
    println("sucessor: $sucessor")
}

// 77
fun main() {
    print("digite 1 numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite 2 numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    val d = (a - b).pow(2.0)
    val q = a.pow(2.0) - b.pow(2.0)

    println("o quadrado da diferenca = $d, diferenca dos quadrados = $q")
}

// 78
fun main() {
    print("digite o numero de lados do poligono: ")
    val n = readLine()?.toIntOrNull() ?: 0
    val nd = n * (n - 3) / 2
   println("numero de diagonais: $nd")
}

// 79
fun main() {
    print("digite a aplicacao mensal: ")
    val p = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite a taxa (ex: 0.01): ")
    val i = readLine()?.toDoubleOrNull() ?: 0.0
    print("digite o numero de meses: ")
    val n = readLine()?.toIntOrNull() ?: 0

    val va = p * (((1 + i).pow(n.toDouble()) - 1) / i)
    println("O valor acumulado: $va")
}

//80
fun main() {
    print("Digite a quantidade de fitas: ")
    val quant = readLine()?.toIntOrNull() ?: 0
    print("Digite o valor do aluguel: ")
    val valAluguel = readLine()?.toDoubleOrNull() ?: 0.0

    val fatAnual = (quant / 3.0) * valAluguel * 12
    val multas = valAluguel * 0.1 * ((quant / 3.0) / 10)
    val quantFinal = quant - (quant * 0.02) + (quant / 10.0)

    println("Faturamento anual: $fatAnual")
    println("Multas mensais: $multas")
    println("Quantidade de fitas no final do ano: $quantFinal")
}

//81
fun main() {
    print("Digite conta de tres digitos: ")
    val conta = readLine()?.toIntOrNull() ?: 0

    val dl1 = conta / 100
    val d2_1 = (conta % 100) / 10
    val d3_1 = conta % 10

    val inv = d3_1 * 100 + d2_1 * 10 + dl1
    val soma = conta + inv

    val d1 = (soma / 100) * 1
    val d2 = ((soma % 100) / 10) * 2
    val d3 = (soma % 10) * 3

    val digito = (d1 + d2 + d3) % 10
    println("digito verificador: $digito")
}

//82
fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero > 20) {
        val met = numero / 2
        println("metade: $met")
    }
}

//83
import kotlin.math.abs

fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero > 0) {
        val inverso = 1 / numero
        println("inverso: $inverso")
    } else {
        val absoluto = abs(numero)
        println("absoluto: $absoluto")
    }
}

// 84
fun main() {
    print("Digite numero: ")
    val a = readLine()?.toIntOrNull() ?: 0

    if (a % 2 == 0) {
        println("PAR")
    } else {
        println("IMPAR")
    }
}

// 85
fun main() {
    print("Digite 1 numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2 numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 3 numero: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    val max = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }

    println(max)
}

//86
fun main() {
    print("Digite numero: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0

    if (num > 0) {
        println("POSITIVO")
    } else if (num < 0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}

//87
fun main() {
    print("Qual a capital do Brasil? ")
    val resp = readLine() ?: ""

    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("PARABÉNS!")
    } else if (resp == "brasília" || resp == "BRASILIA" || resp == "Brazília" || resp == "brazília") {
        println("CERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}

//88
fun main() {
    println("*************")
    println("*CALCULADORA*")
    println("*************")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir\n")

    print("Digite opcao: ")
    val resp = readLine() ?: ""

    if (resp == "+" || resp == "-" || resp == "*" || resp == "/") {
        print("Digite 1 numero com ponto: ")
        val a = readLine()?.toDoubleOrNull() ?: 0.0
        print("Digite 2 numero com ponto: ")
        val b = readLine()?.toDoubleOrNull() ?: 0.0

        when (resp) {
            "+" -> println("SOMA: ${a + b}")
            "-" -> println("SUBTRACAO: ${a - b}")
            "*" -> println("MULTIPLICACAO: ${a * b}")
            "/" -> {
                if (b != 0.0) println("DIVISAO: ${a / b}")
                else println("Divisão por zero!")
            }
        }
    } else {
        println("OPÇÃO NÃO DISPONÍVEL!")
    }
}

//89
fun main() {
    println("Planetas que podem ser analisados:")
    println("1 mercurio")
    println("2 venus")
    println("3 marte")
    println("4 jupiter")
    println("5 saturno")
    println("6 urano")

    print("Escolha o planeta a ser analisado: ")
    val op = readLine()?.toIntOrNull() ?: 0
    print("Entre com um peso na terra: ")
    val pterra = readLine()?.toDoubleOrNull() ?: 0.0

    when (op) {
        1 -> println("seu peso no planeta terra é: ${(pterra / 10) * 0.37}")
        2 -> println("seu peso no planeta terra é: ${(pterra / 10) * 0.88}")
        3 -> println("seu peso no planeta terra é: ${(pterra / 10) * 0.38}")
        4 -> println("seu peso no planeta terra é: ${(pterra / 10) * 2.64}")
        5 -> println("seu peso no planeta terra é: ${(pterra / 10) * 1.15}")
        6 -> println("seu peso no planeta terra é: ${(pterra / 10) * 1.17}")
        else -> println("este planeta não pode ser analisado")
    }
}

//90
fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero > 20) {
        println(numero)
    }
}

//91
fun main() {
    print("Digite 1 numero: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Digite 2 numero: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    val soma = num1 + num2
    if (soma > 10) {
        println("soma: $soma")
    }
}

//92
fun main() {
    print("Digite 1 numero: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2 numero: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    val soma = num1 + num2
    if (soma > 20.0) {
        println("soma: ${soma + 8}")
    } else {
        println("soma: ${soma - 5}")
    }
}

//93
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero > 0) {
        println("raiz: ${sqrt(numero)}")
    } else if (numero < 0) {
        println("quadrado: ${numero.pow(2)}")
    }
}

//94
fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero % 3 == 0) {
        println("multiplo de 3")
    } else {
        println("nao e multiplo de 3")
    }
}

//95
fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero % 5 == 0) {
        println("e divisivel por 5")
    } else {
        println("nao e divisivel por 5")
    }
}

//96
fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero % 3 == 0 && numero % 7 == 0) {
        println("divisivel por 3 e por 7")
    } else {
        println("nao e divisivel por 3 e por 7")
    }
}

//97
fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero % 10 == 0) {
        println("múltiplo de 10")
    } else if (numero % 2 == 0) {
        println("múltiplo de 2")
    } else if (numero % 5 == 0) {
        println("múltiplo de 5")
    } else {
        println("não é múltiplo de 2 nem de 5")
    }
}

//98
fun main() {
    print("Digite o salario: ")
    val sb = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite o valor da prestacao: ")
    val vp = readLine()?.toDoubleOrNull() ?: 0.0

    if (vp <= 0.3 * sb) {
        println("emprestimo concedido")
    } else {
        println("emprestimo negado")
    }
}

//99
fun main() {
    print("Numero de 3 algarismos: ")
    val num = readLine()?.toIntOrNull() ?: 0
    val c = num / 100

    if (c % 2 == 0) {
        println("o algarismo das centenas e par: $c")
    } else {
        println("o algarismo das centenas e impar: $c")
    }
}

//100
fun main() {
    print("Numero de 4 algarismos: ")
    val num = readLine()?.toIntOrNull() ?: 0
    val c = num / 100

    if (c % 4 == 0) {
        println("o numero e multiplo de 4: $c")
    } else {
        println("o numero nao e multiplo de 4: $c")
    }
}

//101
fun main() {
    print("Digite numero: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0

    if (num > 20 && num < 90) {
        println("o número está na faixa de 20 a 90, exclusive")
    } else {
        println("o número está fora da faixa de 20 a 90")
    }
}

// 102
fun main() {
    print("Digite numero: ")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero > 20) {
        println("maior que 20")
    } else if (numero < 20) {
        println("menor que 20")
    } else {
        println("igual a 20")
    }
}

//103
fun main() {
    print("Entre com ano atual: ")
    val anoa = readLine()?.toIntOrNull() ?: 0
    print("Entre com ano de nascimento: ")
    val anon = readLine()?.toIntOrNull() ?: 0

    if (anon > anoa) {
        println("Ano de Nascimento Invalido")
    } else {
        println("Idade: ${anoa - anon}")
    }
}

//104
fun main() {
    print("Digite nome: ")
    val nome = readLine() ?: ""
    print("Digite sexo: ")
    val sexo = readLine() ?: ""
    print("Digite idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    if ((sexo.equals("F", ignoreCase = true)) && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NAO ACEITA")
    }
}

//105
fun main() {
    print("Digite sigla: ")
    val sigla = readLine() ?: ""

    when (sigla.uppercase()) {
        "RJ" -> println("carioca")
        "SP" -> println("paulista")
        "MG" -> println("mineiro")
        else -> println("outros estados")
    }
}

//106
fun main() {
    print("Digite nome: ")
    val nome = readLine() ?: ""

    if (nome.isNotEmpty() && (nome[0] == 'A' || nome[0] == 'a')) {
        println(nome)
    }
}

//107
fun main() {
    print("Digite nome: ")
    val nome = readLine() ?: ""

    if (nome.startsWith("JOSÉ ") || nome == "JOSÉ") {
        println(nome)
    }
}

//108
fun main() {
    print("Digite nome: ")
    val nome = readLine() ?: ""

    if (nome.startsWith("JOSÉ", ignoreCase = true) || nome.equals("JOSÉ", ignoreCase = true)) {
        println(nome)
    }
}

//109
fun main() {
    print("Digite 1o nome: ")
    val nome1 = readLine() ?: ""
    print("Digite 2o nome: ")
    val nome2 = readLine() ?: ""

    if (nome1 < nome2) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}

//110
fun main() {
    print("Digite 1o nome: ")
    val nome1 = readLine() ?: ""
    print("Digite 2o nome: ")
    val nome2 = readLine() ?: ""

    if (nome1.compareTo(nome2) < 0) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}

//111
fun main() {
    print("Digite 1o numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2o numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    if (a > b) {
        println("maior: $a")
    } else {
        println("maior: $b")
    }
}

//112
fun main() {
    print("Digite 1o numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2o numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    if (a < b) {
        println("menor: $a")
    } else {
        println("menor: $b")
    }
}

//113
fun main() {
    print("Digite 1o numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2o numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    if (a < b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

//114
fun main() {
    print("Digite 1o numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2o numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

//115
fun main() {
    print("Digite valor de x: ")
    val x = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite valor de y: ")
    val y = readLine()?.toDoubleOrNull() ?: 0.0

    if (x > y) {
        println("Raiz do maior: ${sqrt(x)}")
        println("Quadrado do menor: ${y.pow(2)}")
    } else if (y > x) {
        println("Raiz do maior: ${sqrt(y)}")
        println("Quadrado do menor: ${x.pow(2)}")
    } else {
        println("numeros iguais")
    }
}

//116
fun main() {
    print("Digite 1 numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2 numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 3 numero: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    if (a > b && a > c) {
        println("maior: $a")
    } else if (b > c) {
        println("maior: $b")
    } else {
        println("maior: $c")
    }
}

//117
fun main() {
    print("Digite 1 numero: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2 numero: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 3 numero: ")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c

    println("maior: $maior")
}

//118
fun main() {
    print("Digite 1 numero: ")
    var a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2 numero: ")
    var b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 3 numero: ")
    var c = readLine()?.toDoubleOrNull() ?: 0.0

    if (a > b) { val aux = a; a = b; b = aux }
    if (a > c) { val aux = a; a = c; c = aux }
    if (b > c) { val aux = b; b = c; c = aux }

    println("Ordem Crescente: $a $b $c")
}

//119
fun main() {
    print("Digite 1 numero: ")
    var a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2 numero: ")
    var b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 3 numero: ")
    var c = readLine()?.toDoubleOrNull() ?: 0.0

    if (a > b) { val aux = a; a = b; b = aux }
    if (a > c) { val aux = a; a = c; c = aux }
    if (b > c) { val aux = b; b = c; c = aux }

    println("Ordem Decrescente: $c $b $a")
}

//120
fun main() {
    print("Digite 1 numero: ")
    var a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 2 numero: ")
    var b = readLine()?.toDoubleOrNull() ?: 0.0
    print("Digite 3 numero: ")
    var c = readLine()?.toDoubleOrNull() ?: 0.0

    if (a > b) { val aux = a; a = b; b = aux }
    if (a > c) { val aux = a; a = c; c = aux }
    if (b > c) { val aux = b; b = c; c = aux }

    val menor = a
    val intermediario = b
    val maior = c

    println("maior: $maior")
    println("intermediario: $intermediario")
    println("menor: $menor")
}
