<section id="accions" class="py4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="clo-md-3">
                <a href="index.jsp" class="btn btn-ligh btn-block">
                    <i class="fas fa-arrow-left"></i> Regresa al inicio
                </a>
            </div>
            <div class="clo-md-3">
                <button type="submit" class="btn btn-success btn-block">
                    <i class="fas fa-check"></i> Guardar Cliente
                </button>
            </div>
            <div class="clo-md-3">
                <a href="${page.context.request.contextPath}/ServletControlador?accion=eliminar&idCliente=${cliente.idCliente}"
                   class="btn btn-danger btn-block">
                    <i class="fas fa-trash"></i>Eliminar Cliente
                </a>
            </div>
        </div>
    </div>
    
</section>