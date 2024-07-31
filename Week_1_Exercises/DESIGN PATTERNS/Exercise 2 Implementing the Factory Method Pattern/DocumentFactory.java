// Abstract DocumentFactory class
public abstract class DocumentFactory {
    public abstract Document createDocument();
}

// WordDocumentFactory class
class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

// PdfDocumentFactory class
class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

// ExcelDocumentFactory class
class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
