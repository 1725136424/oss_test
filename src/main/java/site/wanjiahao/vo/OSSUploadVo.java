package site.wanjiahao.vo;

import lombok.Data;

@Data
public class OSSUploadVo {

    private String filename;

    private Long size;

    private String mimeType;

    private Float height;

    private Float width;
}
