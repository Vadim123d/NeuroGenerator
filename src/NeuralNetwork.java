
public class CreateNeuralNetwork {


    // [1] --- вводимые данные при задании нейросети ---
    // Количество нейронов на входном слое нейросети
    int numberOfNeuronsOnInputLayer;

    // Количество нейронов на каждом скрытом слое нейросети
    int numberOfNeuronsOnEachHiddenLayer;

    // Количество скрытых слоев нейросети
    int NumberOfHiddenLayersOfNeuralNetwork;

    // Количество нейронов на выходном слое нейросети
    int numberOfNeuronsOnOutputLayerOfNeuralNetwork;

    // Тип функции активации
    // [1] ------



    // У любой нейросети есть входные данные. Их можно представить в виде одномерного массива
    // Даже кадр видео можно передавать так - просто, взять в расчет то, что одна строка - это х элементов массива
    double inputSignalsMatrix_1 []; // Это входной слон нейросети - он просто принимает сигналы.
    // Матрица содержит сигналы, поступающие на вход нейросети

    double weighInput_hidden1 [][]; // веса между входным слоем и первым скрытым слоем
    // столбец обозначает все веса, исходящие из одного входного нейрона к нейронам скрытых слоев
    // один вес - это одна связь входной нейрон - скрытый слой

    double SumOfWeightedInputsFirstLayer [];

    // сумма взвешенных входов для первого скрытого слоя
    double [] methodSumOfWeightedInputsFirstLayer () {


        return SumOfWeightedInputsFirstLayer;
    }



}
