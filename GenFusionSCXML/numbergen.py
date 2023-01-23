# YES("[YES]",1500);
# 	NUMBER("[NUMBER]")

def main():
    lista = []
    for i in range(10,510,10):
        lista.append("NUMBER"+str(i)+"(\"[NUMBER]["+str(i)+"]\",1500)")
    for item in lista:
        print(item+",")


    lista = []
    for i in range(10,510,10):
        lista.append("RAISE"+str(i)+"(\"[RAISE][NUMBER]["+str(i)+"]\")")
    for item in lista:
        print(item+",")

    lista = []
    for i in range(10,510,10):
        lista.append("fg.Complementary(Speech.NUMBER"+str(i)+", SecondMod.RAISE, Output.RAISE"+str(i)+");")
    # for item in lista:
    #     print(item+",")
    # fg.Complementary(Speech.CIRCLE, SecondMod.YELLOW, Output.CIRCLE_YELLOW);
main()