
public class CreateNeuralNetwork {


    // [1] --- �������� ������ ��� ������� ��������� ---
    // ���������� �������� �� ������� ���� ���������
    int numberOfNeuronsOnInputLayer;

    // ���������� �������� �� ������ ������� ���� ���������
    int numberOfNeuronsOnEachHiddenLayer;

    // ���������� ������� ����� ���������
    int NumberOfHiddenLayersOfNeuralNetwork;

    // ���������� �������� �� �������� ���� ���������
    int numberOfNeuronsOnOutputLayerOfNeuralNetwork;

    // ��� ������� ���������
    // [1] ------



    // � ����� ��������� ���� ������� ������. �� ����� ����������� � ���� ����������� �������
    // ���� ���� ����� ����� ���������� ��� - ������, ����� � ������ ��, ��� ���� ������ - ��� � ��������� �������
    double inputSignalsMatrix_1 []; // ��� ������� ���� ��������� - �� ������ ��������� �������.
    // ������� �������� �������, ����������� �� ���� ���������

    double weighInput_hidden1 [][]; // ���� ����� ������� ����� � ������ ������� �����
    // ������� ���������� ��� ����, ��������� �� ������ �������� ������� � �������� ������� �����
    // ���� ��� - ��� ���� ����� ������� ������ - ������� ����

    double SumOfWeightedInputsFirstLayer [];

    // ����� ���������� ������ ��� ������� �������� ����
    double [] methodSumOfWeightedInputsFirstLayer () {


        return SumOfWeightedInputsFirstLayer;
    }



}
