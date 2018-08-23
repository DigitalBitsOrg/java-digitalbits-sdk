package io.digitalbits.sdk;

import io.digitalbits.sdk.xdr.OperationType;

/**
 * Represents <a href="https://developer.digitalbits.io/guides/concepts/list-of-operations.html#inflation" target="_blank">Inflation</a> operation.
 * @see <a href="https://developer.digitalbits.io/guides/concepts/list-of-operations.html" target="_blank">List of Operations</a>
 */
public class InflationOperation extends Operation {
    @Override
    io.digitalbits.sdk.xdr.Operation.OperationBody toOperationBody() {
        io.digitalbits.sdk.xdr.Operation.OperationBody body = new io.digitalbits.sdk.xdr.Operation.OperationBody();
        body.setDiscriminant(OperationType.INFLATION);
        return body;
    }
}
