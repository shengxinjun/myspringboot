package com.domain;

import java.io.Serializable;

public class File implements Serializable {

    private static final long serialVersionUID = -1252363716;

    private Integer id;
    private String  fileName;
    private String  fileUrl;
    private Integer source;
    private Integer sourceId;

    public File() {}

    public File(File value) {
        this.id = value.id;
        this.fileName = value.fileName;
        this.fileUrl = value.fileUrl;
        this.source = value.source;
        this.sourceId = value.sourceId;
    }

    public File(
        Integer id,
        String  fileName,
        String  fileUrl,
        Integer source,
        Integer sourceId
    ) {
        this.id = id;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.source = source;
        this.sourceId = sourceId;
    }

    public Integer getId() {
        return this.id;
    }

    public File setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFileName() {
        return this.fileName;
    }

    public File setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public File setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public Integer getSource() {
        return this.source;
    }

    public File setSource(Integer source) {
        this.source = source;
        return this;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public File setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final File other = (File) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (fileName == null) {
            if (other.fileName != null)
                return false;
        }
        else if (!fileName.equals(other.fileName))
            return false;
        if (fileUrl == null) {
            if (other.fileUrl != null)
                return false;
        }
        else if (!fileUrl.equals(other.fileUrl))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        }
        else if (!source.equals(other.source))
            return false;
        if (sourceId == null) {
            if (other.sourceId != null)
                return false;
        }
        else if (!sourceId.equals(other.sourceId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
        result = prime * result + ((fileUrl == null) ? 0 : fileUrl.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((sourceId == null) ? 0 : sourceId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("File (");

        sb.append(id);
        sb.append(", ").append(fileName);
        sb.append(", ").append(fileUrl);
        sb.append(", ").append(source);
        sb.append(", ").append(sourceId);

        sb.append(")");
        return sb.toString();
    }
}
