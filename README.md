# HAR Java
A convenient java library for writing and reading HAR

## Usage

```HarStreamWriter``` allows to append entries over time. Once no more entry needs to be added ```closeHar()``` needs to be called explicitly. 

```java
// Create HarStreamWriter if you want to append entries over time
HarStreamWriter harWriter = new DefaultHarStreamWriter.Builder().withOutputFile(new File("log.har")).withUsePrettyPrint(true).build();

// Create the entry model with request/response and other mandatory fields
HarRequest harRequest = new HarRequestBuilder().withMethod("GET").withUrl("http://smartbear/resource").withHttpVersion("HTTP/1.1").build();
HarResponse harResponse = new HarResponseBuilder().build();

// Add the entry
harWriter.addEntry(new HarEntryBuilder().withRequest(harRequest).withResponse(harResponse).build());

// finally close the HAR
harWriter.closeHar();

```
