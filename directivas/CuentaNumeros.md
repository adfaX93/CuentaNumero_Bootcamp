## Queremos generar todos los números de tres dígitos donde:
* la suma de sus cifras es igual a 10.
* sus dígitos están en orden creciente (los números pueden tener dos o más dígitos contiguos iguales)
* Los números que cumplen las dos restricciones anteriores son: 118, 127, 136, 145, 226, 235, 244, 334

## Haz una función que reciba dos argumentos:
* el valor de la suma de dígitos
* el número deseado de dígitos para los números
* La función debe generar una matriz con tres valores: [1,2,3]
### En donde:
1 - el número total de números posibles
2 - el número mínimo
3 - el número máximo

## El ejemplo anterior debería ser:

`CuentaNumero.findAll(10, 3) == [8, 118, 334]   // as List<Long>`

## Si solo tenemos un posible numero como solucion:

`CuentaNumero.findAll(27, 3) == [1, 999, 999] `

## Si no hay numeros posibles:

`CuentaNumero.findAll(84, 4) == [] `

## El numero de soluciones aumenta si los digitos aumentan:
`CuentaNumero.findAll(35, 6) == [123, 116999, 566666] `