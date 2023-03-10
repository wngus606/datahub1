package com.linkedin.metadata.graph;

import com.linkedin.common.urn.Urn;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class Edge {
  private Urn source;
  private Urn destination;
  private String relationshipType;
  private Long createdOn;
  private Urn createdActor;
  private Long updatedOn;
  private Urn updatedActor;
  private Map<String, Object> properties;
}
