(function() {
    "use strict";

    angular
        .module("MyApp")
        .controller("ServicoFormController", ServicoFormController);

    ServicoFormController.$inject = [
        "ServicoService",
        "$location",
        "$routeParams",
        "$scope",
    ];

    function ServicoFormController(
        ServicoService,
        $location,
        $routeParams
    ) {
        var vm = this;
        vm.cadastro = {};
        vm.titulo = "Novo Servico";
        vm.item = null;
        vm.salvar = salvar;
        vm.select = select;

        activate();


        function activate() {
            if ($routeParams.id) {
                ServicoService.findById($routeParams.id).success(function(data) {
                    vm.cadastro = data;
                    vm.titulo = "Editando Servico";
                });
            }
        }

        function salvar() {
            ServicoService.save(vm.cadastro).success(function() {
                $location.path("/servico");
                alert("Servico cadastrada com sucesso!!");
            }).error(function(erro) {
                alert(JSON.stringify(erro));
            });
        }

        function select(valor) {
            return '"' + valor + '"';
        }

    }
})();