class AddingOptionalLabels {
	public static void main(String[] args){
		int[][] myComplexArray = { {5,2,1,3},{3,9,8,9},{5,7,12,7} };

		//898loop_empieza_por_numero				//No compila
		$outer_loop: for(int[] mySimpleArray : myComplexArray ) {
			_inner_loop: for(int i = 0; i < mySimpleArray.length; i++) {
				System.out.println(mySimpleArray[i] + "\t");
			}
		}
	}
}