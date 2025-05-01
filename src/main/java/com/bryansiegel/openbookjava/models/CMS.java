package com.bryansiegel.openbookjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class CMS {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

    private Long id;

//    Header
    private String headerTitle;
    @Lob
    private String headerParagraph;

//    Intro
    private String introTitle;
    private String introNumber;
    private String introSentenceUnderNumber;
    @Lob
    private String introParagraph;

//    Blueprint
    private String bluePrintTitle;
    @Lob
    private String blueprintParagraph;
    private String bluePrintReadMoreLink;

//    Strategic Initiatives
//    TODO: TURN THIS INTO HASMANY RELATIONSHIP
    private String initiativeOne;
    private String initiativeTwo;
    private String initiativeThree;
    private String initiativeFour;
    private String initiativeFive;

//    Tools
//    TODO: TURN THIS INTO HASMANY RELATIONSHIP
    private String toolsImageOne;
    private String toolsTitleOne;
    private String toolsReadMoreLinkOne;

    private String toolsImageTwo;
    private String toolsTitleTwo;
    private String toolsReadMoreLinkTwo;

    private String toolsImageThree;
    private String toolsTitleThree;
    private String toolsReadMoreLinkThree;

    private String toolsImageFour;
    private String toolsTitleFour;
    private String toolsReadMoreLinkFour;

//    School Data
    @Lob
    private String elementarySchoolParagraph;
    @Lob
    private String middleSchoolParagraph;
    @Lob
    private String highSchoolParagraph;
    @Lob
    private String magnetSchoolParagraph;

//    Meta Information
    private String pageTitle;
    private String metaDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getHeaderParagraph() {
        return headerParagraph;
    }

    public void setHeaderParagraph(String headerParagraph) {
        this.headerParagraph = headerParagraph;
    }

    public String getIntroTitle() {
        return introTitle;
    }

    public void setIntroTitle(String introTitle) {
        this.introTitle = introTitle;
    }

    public String getIntroNumber() {
        return introNumber;
    }

    public void setIntroNumber(String introNumber) {
        this.introNumber = introNumber;
    }

    public String getIntroSentenceUnderNumber() {
        return introSentenceUnderNumber;
    }

    public void setIntroSentenceUnderNumber(String introSentenceUnderNumber) {
        this.introSentenceUnderNumber = introSentenceUnderNumber;
    }

    public String getIntroParagraph() {
        return introParagraph;
    }

    public void setIntroParagraph(String introParagraph) {
        this.introParagraph = introParagraph;
    }

    public String getBluePrintTitle() {
        return bluePrintTitle;
    }

    public void setBluePrintTitle(String bluePrintTitle) {
        this.bluePrintTitle = bluePrintTitle;
    }

    public String getBlueprintParagraph() {
        return blueprintParagraph;
    }

    public void setBlueprintParagraph(String blueprintParagraph) {
        this.blueprintParagraph = blueprintParagraph;
    }

    public String getBluePrintReadMoreLink() {
        return bluePrintReadMoreLink;
    }

    public void setBluePrintReadMoreLink(String bluePrintReadMoreLink) {
        this.bluePrintReadMoreLink = bluePrintReadMoreLink;
    }

    public String getInitiativeOne() {
        return initiativeOne;
    }

    public void setInitiativeOne(String initiativeOne) {
        this.initiativeOne = initiativeOne;
    }

    public String getInitiativeTwo() {
        return initiativeTwo;
    }

    public void setInitiativeTwo(String initiativeTwo) {
        this.initiativeTwo = initiativeTwo;
    }

    public String getInitiativeThree() {
        return initiativeThree;
    }

    public void setInitiativeThree(String initiativeThree) {
        this.initiativeThree = initiativeThree;
    }

    public String getInitiativeFour() {
        return initiativeFour;
    }

    public void setInitiativeFour(String initiativeFour) {
        this.initiativeFour = initiativeFour;
    }

    public String getInitiativeFive() {
        return initiativeFive;
    }

    public void setInitiativeFive(String initiativeFive) {
        this.initiativeFive = initiativeFive;
    }

    public String getToolsImageOne() {
        return toolsImageOne;
    }

    public void setToolsImageOne(String toolsImageOne) {
        this.toolsImageOne = toolsImageOne;
    }

    public String getToolsTitleOne() {
        return toolsTitleOne;
    }

    public void setToolsTitleOne(String toolsTitleOne) {
        this.toolsTitleOne = toolsTitleOne;
    }

    public String getToolsReadMoreLinkOne() {
        return toolsReadMoreLinkOne;
    }

    public void setToolsReadMoreLinkOne(String toolsReadMoreLinkOne) {
        this.toolsReadMoreLinkOne = toolsReadMoreLinkOne;
    }

    public String getToolsImageTwo() {
        return toolsImageTwo;
    }

    public void setToolsImageTwo(String toolsImageTwo) {
        this.toolsImageTwo = toolsImageTwo;
    }

    public String getToolsTitleTwo() {
        return toolsTitleTwo;
    }

    public void setToolsTitleTwo(String toolsTitleTwo) {
        this.toolsTitleTwo = toolsTitleTwo;
    }

    public String getToolsReadMoreLinkTwo() {
        return toolsReadMoreLinkTwo;
    }

    public void setToolsReadMoreLinkTwo(String toolsReadMoreLinkTwo) {
        this.toolsReadMoreLinkTwo = toolsReadMoreLinkTwo;
    }

    public String getToolsImageThree() {
        return toolsImageThree;
    }

    public void setToolsImageThree(String toolsImageThree) {
        this.toolsImageThree = toolsImageThree;
    }

    public String getToolsTitleThree() {
        return toolsTitleThree;
    }

    public void setToolsTitleThree(String toolsTitleThree) {
        this.toolsTitleThree = toolsTitleThree;
    }

    public String getToolsReadMoreLinkThree() {
        return toolsReadMoreLinkThree;
    }

    public void setToolsReadMoreLinkThree(String toolsReadMoreLinkThree) {
        this.toolsReadMoreLinkThree = toolsReadMoreLinkThree;
    }

    public String getToolsImageFour() {
        return toolsImageFour;
    }

    public void setToolsImageFour(String toolsImageFour) {
        this.toolsImageFour = toolsImageFour;
    }

    public String getToolsTitleFour() {
        return toolsTitleFour;
    }

    public void setToolsTitleFour(String toolsTitleFour) {
        this.toolsTitleFour = toolsTitleFour;
    }

    public String getToolsReadMoreLinkFour() {
        return toolsReadMoreLinkFour;
    }

    public void setToolsReadMoreLinkFour(String toolsReadMoreLinkFour) {
        this.toolsReadMoreLinkFour = toolsReadMoreLinkFour;
    }

    public String getElementarySchoolParagraph() {
        return elementarySchoolParagraph;
    }

    public void setElementarySchoolParagraph(String elementarySchoolParagraph) {
        this.elementarySchoolParagraph = elementarySchoolParagraph;
    }

    public String getMiddleSchoolParagraph() {
        return middleSchoolParagraph;
    }

    public void setMiddleSchoolParagraph(String middleSchoolParagraph) {
        this.middleSchoolParagraph = middleSchoolParagraph;
    }

    public String getHighSchoolParagraph() {
        return highSchoolParagraph;
    }

    public void setHighSchoolParagraph(String highSchoolParagraph) {
        this.highSchoolParagraph = highSchoolParagraph;
    }

    public String getMagnetSchoolParagraph() {
        return magnetSchoolParagraph;
    }

    public void setMagnetSchoolParagraph(String magnetSchoolParagraph) {
        this.magnetSchoolParagraph = magnetSchoolParagraph;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }
}
