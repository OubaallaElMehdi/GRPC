// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.projet.grpc.stubs;

public interface GetSummaryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetSummaryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .TypeCompteSummary summaries = 1;</code>
   */
  java.util.List<ma.projet.grpc.stubs.TypeCompteSummary> 
      getSummariesList();
  /**
   * <code>repeated .TypeCompteSummary summaries = 1;</code>
   */
  ma.projet.grpc.stubs.TypeCompteSummary getSummaries(int index);
  /**
   * <code>repeated .TypeCompteSummary summaries = 1;</code>
   */
  int getSummariesCount();
  /**
   * <code>repeated .TypeCompteSummary summaries = 1;</code>
   */
  java.util.List<? extends ma.projet.grpc.stubs.TypeCompteSummaryOrBuilder> 
      getSummariesOrBuilderList();
  /**
   * <code>repeated .TypeCompteSummary summaries = 1;</code>
   */
  ma.projet.grpc.stubs.TypeCompteSummaryOrBuilder getSummariesOrBuilder(
      int index);
}
