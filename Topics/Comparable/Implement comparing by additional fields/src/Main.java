class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        int a = Integer.valueOf(getSize()).compareTo(otherArticle.getSize());
        return a == 1 || a == -1 ? a : getTitle().compareTo(otherArticle.getTitle());

    }
}
