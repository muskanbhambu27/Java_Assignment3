
public class Matrix {
	int row;
	int column;
	int matrix[][];

	public Matrix(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		matrix = new int[row][column];
	}

	public int getRows() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void insertElement(int i, int j, int value) {
		if ((i >= 0 && i < row) && (j >= 0 && j < column)) {
			matrix[i][j] = value;
		} else {
			System.out.println("Invalid index position");
		}

	}

	public static Matrix addMatrix(Matrix obj1, Matrix obj2) {
		if (obj1.row != obj2.row || obj1.column != obj2.column) {
			System.out.println("Addition is not possible");
			return null;
		} else {
			Matrix result = new Matrix(obj1.row, obj1.column);
			for (int i = 0; i < obj1.row; i++) {
				for (int j = 0; j < obj1.column; j++) {
					result.matrix[i][j] = obj1.matrix[i][j] + obj2.matrix[i][j];
				}
			}
			return result;

		}

	}

	public void display() {
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
		System.out.print(matrix[i][j]+" ");
	}
	System.out.println();
}
	}

	public static void main(String[] args) {
      Matrix one=new Matrix(2, 2);
      Matrix two=new Matrix(2, 2);
      one.insertElement(0, 0, 1);
      one.insertElement(0, 1, 1);
      one.insertElement(1, 0, 1);
      one.insertElement(1, 1, 1);
      two.insertElement(0, 0, 2);
      two.insertElement(0, 1, 2);
      two.insertElement(1, 0, 2);
      two.insertElement(1, 1, 2);
      Matrix result=addMatrix(one, two);
      result.display();
      
	}

}
