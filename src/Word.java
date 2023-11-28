public enum Word {
    book("book", new String[]{"A written work published in printed or electronic form.","To arrange for someone to have a seat on a plane."}),
    bookable("bookable",new String[]{"Can be ordered in advance."}),
    bookcase("bookcase", new String[]{"A piece of furniture with shelves."}),
    bookbinder("bookbinder" , new String[]{"A person who fastens the pages of books."}),
    cSc220("csc220",new String[]{"Data Structures.","Ready to create complex data structures.","To create data structures."})

    ;
    private String wordName;
    private String[] definitions;

    private Word(String wordName,String[] definitions){
        this.wordName = wordName;
        this.definitions = definitions;
    }
    public String getWordName(){
        return this.wordName;
    }
    public String[] getDefinitions(){
        return definitions;
    }


}
