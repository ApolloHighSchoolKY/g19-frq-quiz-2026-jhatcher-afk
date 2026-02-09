public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  int count = 0;

  for(word x: wordList)
  {
    if(word.length <= 1)
    {
      return word;
    }
    
    
  }
  return scrambleWord(word);
  

}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
for(word x: wordList)
{
  if(scrambleWord(word))
  {
    wordList.remove(word);
    
    wordList.add(scrambleWord(word));
  }

}

}
