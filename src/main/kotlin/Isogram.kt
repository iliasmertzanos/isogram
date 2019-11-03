class Isogram {	
	companion object {
		fun isIsogram(input:String):Boolean{
			var inputLower=input.toLowerCase()					
			inputLower=Regex("[^A-Za-z0-9 ]").replace(inputLower, "").replace(" ","")			
			if(inputLower.toCharArray().distinct().size!=inputLower.toCharArray().size)
				return false
			
			return true;
		}
	}
}