import csv

def primeiro_caso():  #hash usando letras do alfabeto  
    for line in lines:
        numeros = line.split()
        print(numeros)
        writer.writerow(numeros)

with open("src\Files\\tempo.txt", "r") as input_file:
    lines = input_file.readlines()

with open("tempoBuscar.csv", "w", newline="") as output_file:

    writer = csv.writer(output_file)
    primeiro_caso() 