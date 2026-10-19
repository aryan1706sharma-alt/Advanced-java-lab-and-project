<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>ShopSphere - Marketplace</title>
            <!-- Bootstrap CSS for Modern Look -->
            <link href="https://jsdelivr.net" rel="stylesheet">
        </head>

        <body class="bg-light">

            <!-- Responsive Navbar -->
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
                <div class="container">
                    <a class="navbar-brand fw-bold" href="#">🛒 ShopSphere</a>
                </div>
            </nav>

            <!-- Main Container -->
            <div class="container my-5">
                <h2 class="mb-4 text-center text-primary fw-bold">Our Featured Products</h2>

                <div class="row">
                    <!-- c:forEach tag loop chalane ke liye hai aur ${products} EL expression hai -->
                    <c:forEach var="product" items="${products}">
                        <div class="col-md-4 mb-4">
                            <div class="card h-100 shadow-sm border-0">
                                <div class="card-body d-flex flex-column">
                                    <h5 class="card-title fw-bold text-dark">${product.name}</h5>
                                    <h6 class="card-subtitle mb-3 text-muted">Brand: ${product.brand}</h6>
                                    <p class="card-text fs-5 text-success fw-semibold">₹${product.price}</p>

                                    <p class="card-text">
                                        <c:choose>
                                            <c:when test="${product.stock > 0}">
                                                <span
                                                    class="badge bg-success-subtle text-success border border-success-subtle px-2.5 py-1.5">In
                                                    Stock (${product.stock})</span>
                                            </c:when>
                                            <c:otherwise>
                                                <span
                                                    class="badge bg-danger-subtle text-danger border border-danger-subtle px-2.5 py-1.5">Out
                                                    of Stock</span>
                                            </c:otherwise>
                                        </c:choose>
                                    </p>

                                    <!-- Add to Cart Button -->
                                    <button class="btn btn-primary w-100 mt-auto shadow-sm" ${product.stock==0
                                        ? 'disabled' : '' }>
                                        Add to Cart
                                    </button>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>

        </body>

        </html>